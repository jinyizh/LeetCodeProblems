package lc22

func generateParenthesis(n int) []string {
	res := []string{}
	bc(n, n, "", &res)
	return res
}

func bc(left, right int, substr string, res *[]string) {
	// base case
	if left == 0 && right == 0 {
		*res = append(*res, substr)
		return
	}
	if left > 0 {
		bc(left-1, right, substr+"(", res)
	}
	if right > 0 && left < right {
		bc(left, right-1, substr+")", res)
	}
}
