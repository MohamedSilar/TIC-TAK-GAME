### 🎯 **Tic-Tac-Toe Game** 
Tic-Tac-Toe, also called **Noughts and Crosses**, is a classic two-player strategy game played on a 3x3 grid. Here's how it can be implemented in **Java**:

---

### 🌟 **Game Overview**  
1️⃣ **Players** 👥  
   - Two players: **Player 1** and **Player 2**  
   - **Player 1** uses symbol **X**  
   - **Player 2** uses symbol **O**  

2️⃣ **Objective** 🏆  
   - The first player to align **three of their symbols** in a:  
     ➡️ Row  
     ➡️ Column  
     ➡️ Diagonal  
     **WINS** the game! 🎉  

3️⃣ **Draw Condition** 🤝  
   - If all grid positions are filled and no player has three aligned symbols, the game ends in a **DRAW**.  

---

### 🛠️ **Key Features of the Java Implementation**  

1️⃣ **Game Board** 📋  
   - Represented using:  
     🔹 A **2D array (3x3)** or  
     🔹 A **single-dimensional array (size 9)**.  
   - Initially, the board contains **empty spaces** or placeholders (e.g., `'-'`).  

2️⃣ **Player Input** 🎮  
   - Players specify the **position** where they want to place their symbol.  
   - Input validation ensures:  
     ✅ The position is within bounds.  
     ✅ The position is not already occupied.  

3️⃣ **Game Logic** 🤖  
   - Checks for a **winning condition** after every move:  
     🔹 Rows, Columns, or Diagonals with three matching symbols.  
   - Detects if the board is full for a **draw condition**.  

4️⃣ **Turn Management** 🔄  
   - Alternates between **Player 1** and **Player 2** after each valid move.  

5️⃣ **Display** 🖥️  
   - The board is displayed after every move, allowing players to see the **current game state**.  

6️⃣ **Replay Option** 🔄  
   - After the game ends, players are offered an option to **restart the game**.  

---

### 🔧 **How It Works**  

🔹 **Initialize the Game**:  
   - Set up the **board** and display the initial state.  

🔹 **Take Turns**:  
   - Alternate between Player 1 (**X**) and Player 2 (**O**).  
   - Validate the input and place the symbol in the specified position.  

🔹 **Check for Results**:  
   - After each move, check for:  
     ✅ **Win Condition**: Three aligned symbols in a row, column, or diagonal.  
     ✅ **Draw Condition**: Board is full, and no one has won.  

🔹 **Game End**:  
   - Announce the **Winner** or declare a **Draw**.  
   - Offer players the option to **play again**.  

---

### 💻 **Technologies Used**  
🔸 **Java**: Object-oriented programming language.  
🔸 **2D Arrays**: To represent the board.  
🔸 **Scanner**: For taking input from players.  

---

### 🚀 **Setup**  

1️⃣ **Clone the Project**:  
   - Download or clone the repository to your local machine.  

2️⃣ **Run the Program**:  
   - Compile and execute the **TicTacToe.java** file.  

3️⃣ **Play the Game**:  
   - Follow the prompts to make your moves.  

---

### 🏅 **Additional Features to Add**  
✅ **AI Player**: Play against a computer.  
✅ **Custom Board Size**: Allow users to choose a larger board (e.g., 4x4 or 5x5).  
✅ **Timed Moves**: Limit the time players have to make their move.  

---
Contact 📬
For any questions or suggestions, feel free to contact me:

Email: mohamedsilar26@gmail.com
LinkedIn: Mohamed Silar
Thank you for checking out the Food-Coma project! I hope you find it useful and look forward to your feedback. 😊

**Enjoy the ultimate Tic-Tac-Toe experience!** ✨
