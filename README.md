# **Bingo Game Project** 

## **Overview**
Welcome to the Bingo Game project! This project demonstrates a simple implementation of the classic Bingo game, providing an interactive experience for players. Players can purchase Bingo cards, and the system randomly selects numbers for the game. The game supports different win modes, such as **4 corners**, **diagonals**, or **both**. It checks for winners by validating the numbers marked on each card, and announces the winner once all required numbers are drawn. This project is a great way to showcase your understanding of **Java** and object-oriented principles, such as the use of arrays, **ArrayLists**, loops, and more.

## **Features**

- **Purchase Bingo Cards:** Players can buy 10 Bingo cards, each displaying a grid with random numbers.
- **Game Modes:** Players can choose between 4 corners, diagonals, or both win modes.
- **Number Generation:** Randomly generated numbers are drawn during the game, with no repetitions.
- **Winner Detection:** The game detects winners based on the selected game mode and displays the winner's card with the winning pattern.

## **Technologies Used**

- **Java**: The core language used for the game development.
- **ArrayList**: Used to store and manage the numbers drawn in the game and to validate the numbers on each Bingo card.
- **Loops**: Used to iterate through the Bingo cards and numbers, checking for winners in the selected game mode.

## **Detailed Explanation**

### **Key Elements and Functions**

#### 1. **ArrayList** 
- **Purpose**: The `ArrayList` in this project is primarily used to keep track of the numbers that have been drawn during the game. The `ArrayList` ensures that each drawn number is unique by checking if it has already been drawn before adding it to the list. This helps in maintaining fairness during the game.

#### 2. **Matrices** 
- **Purpose**: Each Bingo card is represented by a matrix-like structure (an array of `Celda` objects). The `Celda` class holds the state of each cell on the Bingo card, such as whether it has been selected, the number, and the turn on which it was selected. The matrix representation allows easy access to each cell and efficient checking for winning patterns.

#### 3. **Loops** 
- **Purpose**: Loops are essential in this game, especially in two main areas:
  1. **Drawing Numbers**: A `while` loop continuously generates random numbers until a winner is found.
  2. **Checking Cards for Winning Patterns**: A loop iterates through each of the 10 cards, checking whether the selected number appears on the card. This loop ensures that all cards are checked for potential winners.

## **Game Flow**

1. **Menu:** The game starts by displaying a simple text-based menu where the user can select between buying Bingo cards, starting the game, or quitting.
2. **Buying Cards:** When the player selects to buy cards, 10 Bingo cards are generated and printed out. Each card is displayed with a grid of numbers, and the numbers are randomly assigned.
3. **Game Start:** After the cards are purchased, the player can choose to start the game. The system will prompt the user to select a game mode, either 4 corners, diagonals, or both.
4. **Number Drawing:** Numbers are randomly drawn and displayed. For each number, the game checks if any card matches the drawn number, and updates the cards accordingly.
5. **Winner Detection:** Once a Bingo card meets the winning criteria (either 4 corners or a diagonal), the system announces the winner and ends the game.

## **Files and Classes**

| **Class/File**     | **Description**                                                                 |
|--------------------|---------------------------------------------------------------------------------|
| `Menu.java`        | Contains the main logic of the game, including the user interface, number drawing, and winner detection. |
| `Letras.java`      | An enum representing the letters B, I, N, G, O, which are used to form the Bingo card structure. |
| `Celda.java`       | Represents a single cell on the Bingo card, storing the number and state of the cell (selected or not). |
| `Carton.java`      | Represents a Bingo card, with methods for generating random numbers, printing the card, and checking for winning patterns. |

## **How to Run**
To run this project, follow these steps:

1. Download the project files.
2. Compile and run the `Menu.java` file.
3. Follow the on-screen instructions to buy cards, start the game, and check for winners.

## Contributing

Contributions are always welcome! If you have suggestions, improvements, or bug fixes, feel free to open an issue or create a pull request. 

## Contact  

Feel free to reach out for any questions or suggestions!  

- **Email**: emerson04vade@gmail.com  
- **GitHub**: EmersonJPJ 
