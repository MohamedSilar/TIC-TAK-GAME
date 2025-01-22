# TIC-TAK-GAME 🎯


Tic Tac Toe, also known as Noughts and Crosses, is a simple two-player strategy game typically played on a 3x3 grid. In Java, you can implement this game using various programming techniques such as object-oriented programming or procedural programming. Below is a detailed description of the game and how it can be implemented using Java:

Game Overview:

Players: Two players take turns (Player 1 and Player 2).
Player 1 uses symbol X.
Player 2 uses symbol O.
Objective: The first player to align three of their symbols in a row, column, or diagonal wins.
Draw Condition: If all grid positions are filled and no player has three aligned symbols, the game ends in a draw.

Key Features of the Java Implementation

Game Board:
Represented using a 2D array (3x3) or a single-dimensional array of size 9.
Initially, the board contains empty spaces or placeholders (e.g., '-').
Player Input:

Players provide the position where they want to place their symbol.
Input validation ensures the position is within bounds and not already occupied.
Game Logic:

Checks for a winning condition after every move.
Includes logic to detect rows, columns, and diagonals with three matching symbols.
Detects if the board is full for a draw condition.

Turn Management:
Alternates between Player 1 and Player 2 after each valid move.
Display:

The board is displayed after each move for players to see the current game state.
Replay Option:

Players may be given the option to restart the game after it ends.
