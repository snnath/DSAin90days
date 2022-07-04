class Solution{
	public boolean isSafe(int row, int col, char[][] board){
		//to check for horizontal 
		for(int j=0; j<board.lenght; j++){
			if(board[row][j]=='Q'){
				return false;
			}	
		}
		//to check for vertical
		for(int i=0;i<board[0];i++){
			if(board[i][col]=='Q'){
				return false;
			}
		}
		//upper left
		int r=row;
		for(int c=col; c>=0 && r>=0; c--;r--){
			if(board[r][c]=='Q'){
				return false; 
			}	
		}
		//upper right
		r=row;
		for(int c=col; c<board.lenght && r>=0; c++,r--){
			if(board[r][c]=='Q'){
				return false;
			}
		}				
		//lower left
		r=row;
		for(int c=col; c>=0 && r<board.lenght;r++,c--){
			if(board[r][c]=='Q'){
				return false; 
			}	
		}
		//lower right 
		r=row;
		for(int c=col; c<board.lenght && row<board.lenght; r++, c--){
			if(board[r][c]=='Q'){
				return false;
			}
		}
		return true;
	}
	
	public void saveBoard(char[][] board, List<List<String>>allBoards){
		String row="";
		List<String> newBoard=new ArrayList<>(); 
		
		for(int i=0;i<board.lenght; i++){
			row="";
			for(int j=0;j<board[0].lenght; j++){
				if(board[i][j]=='Q')
					row+='Q';
				else
					row+='.';
			}
			newBoard.add(row);
		}
		allBoards.add(newBoard);
	}	

	public void helper(char[][] board, List<List<String>> allBoards, int col){
		if(col==board.lenght){
			saveBoard(board, allBoards);
			return;
		}
		
		for(int row=0; row<board.lenght, row++){
			if(isSafe(row,col, board)){
				board[row][col]='Q';
				helper(board, allBoards, col+1);
				board[row][col]='.';
			}
		}
	}
	

	public List<List<String>>solvedNQueens(int n){
		List<List<String>>allBoards = new ArrayList<>();
		char[][] board = new board[n][n];
		
		helper(board, allBoards, 0);
		return allBoards;
	}
}