# Rock Paper Scissors game

A short game built in Java. To keep the code from being too long, the move strings are stored in an array, and the calculation of moves, winners and scores is carried out using integers.

When the game prints back to the user the result of the round, the code accesses the array to get the move associated with its corresponding number so that instead of printing:

"Player chose 0  Computer chose 1"
The output actually reads as

"Player chose rock  Computer chose paper"

The counters will keep track of the number of the number of points the player and computer score, terminating the game when either reaches a score of 3 points.

The game then displays a finishing message with the total number of points scored and the number of rounds played in that game.

The player can then choose a y/n prompt to choose whether to play again or quit.
