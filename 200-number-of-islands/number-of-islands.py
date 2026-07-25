class Solution(object):
    def numIslands(self, grid):

        def check(r, c):
            if r < 0 or c < 0 or r >= rows or c >= cols or grid[r][c] == "0":
                return

            grid[r][c] = "0" 

            check(r, c + 1)   # Right
            check(r, c - 1)   # Left
            check(r - 1, c)   # Up
            check(r + 1, c)   # Down

        rows = len(grid)
        cols = len(grid[0])
        count = 0

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1":
                    count += 1
                    check(r, c)

        return count