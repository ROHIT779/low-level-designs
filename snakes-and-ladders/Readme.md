**Problem Statement:** Implement Snakes and Ladders game 
  
**Design:**
Snake(Head, Tail)  
Ladder(Top, Bottom)  
Player(name, position, has_started)
SnakesAndLaddersGame(snakes, ladders, players, is_game_finished)
SnakesAndLaddersGameOperation(playGame())  
SnakesAndLaddersValidator(validateSnakes(), validateLadders())  

  
**Workflow:**
SnakesAndLaddersDriver(main) calls SnakesAndLaddersExecutor(execute()) calls SnakesAndLaddersValidator(validateSnakes() and validateLadders()) and if validation is passed executor calls SnakesAndLaddersOperation(playGame())  

**Sample Run:**
<pre>  
Enter number of snakes on the board...
2
Enter 0-th snake's head and tail(head > tail)...
95 45
Enter 1-th snake's head and tail(head > tail)...
75 65
Enter number of ladders on the board...
2
Enter 0-th ladder's top and bottom(top > bottom)...
80 50
Enter 1-th ladder's top and bottom(top > bottom)...
40 10
Enter number of players...
2
Enter player 0-th name...
gautam
Enter player 1-th name...
mukesh
Player name: gautam Player position: 0 hasStarted: false
Dice value: 1
gautam's new position: 1
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 3
Player name: gautam Player position: 1 hasStarted: true
Dice value: 2
gautam's new position: 3
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 4
Player name: gautam Player position: 3 hasStarted: true
Dice value: 6
gautam's new position: 9
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 4
Player name: gautam Player position: 9 hasStarted: true
Dice value: 5
gautam's new position: 14
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 3
Player name: gautam Player position: 14 hasStarted: true
Dice value: 2
gautam's new position: 16
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 2
Player name: gautam Player position: 16 hasStarted: true
Dice value: 6
gautam's new position: 22
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 6
Player name: gautam Player position: 22 hasStarted: true
Dice value: 1
gautam's new position: 23
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 2
Player name: gautam Player position: 23 hasStarted: true
Dice value: 2
gautam's new position: 25
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 2
Player name: gautam Player position: 25 hasStarted: true
Dice value: 3
gautam's new position: 28
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 5
Player name: gautam Player position: 28 hasStarted: true
Dice value: 5
gautam's new position: 33
Player name: mukesh Player position: 0 hasStarted: false
Dice value: 1
mukesh's new position: 1
Player name: gautam Player position: 33 hasStarted: true
Dice value: 4
gautam's new position: 37
Player name: mukesh Player position: 1 hasStarted: true
Dice value: 3
mukesh's new position: 4
Player name: gautam Player position: 37 hasStarted: true
Dice value: 6
gautam's new position: 43
Player name: mukesh Player position: 4 hasStarted: true
Dice value: 6
mukesh's new position: 10
**Player got ladder from 10 to 40**
Player name: gautam Player position: 43 hasStarted: true
Dice value: 3
gautam's new position: 46
Player name: mukesh Player position: 40 hasStarted: true
Dice value: 4
mukesh's new position: 44
Player name: gautam Player position: 46 hasStarted: true
Dice value: 6
gautam's new position: 52
Player name: mukesh Player position: 44 hasStarted: true
Dice value: 1
mukesh's new position: 45
Player name: gautam Player position: 52 hasStarted: true
Dice value: 1
gautam's new position: 53
Player name: mukesh Player position: 45 hasStarted: true
Dice value: 2
mukesh's new position: 47
Player name: gautam Player position: 53 hasStarted: true
Dice value: 4
gautam's new position: 57
Player name: mukesh Player position: 47 hasStarted: true
Dice value: 2
mukesh's new position: 49
Player name: gautam Player position: 57 hasStarted: true
Dice value: 3
gautam's new position: 60
Player name: mukesh Player position: 49 hasStarted: true
Dice value: 5
mukesh's new position: 54
Player name: gautam Player position: 60 hasStarted: true
Dice value: 6
gautam's new position: 66
Player name: mukesh Player position: 54 hasStarted: true
Dice value: 3
mukesh's new position: 57
Player name: gautam Player position: 66 hasStarted: true
Dice value: 4
gautam's new position: 70
Player name: mukesh Player position: 57 hasStarted: true
Dice value: 2
mukesh's new position: 59
Player name: gautam Player position: 70 hasStarted: true
Dice value: 5
gautam's new position: 75
**Player bitten by snake from 75 to 65**
Player name: mukesh Player position: 59 hasStarted: true
Dice value: 6
mukesh's new position: 65
Player name: gautam Player position: 65 hasStarted: true
Dice value: 6
gautam's new position: 71
Player name: mukesh Player position: 65 hasStarted: true
Dice value: 2
mukesh's new position: 67
Player name: gautam Player position: 71 hasStarted: true
Dice value: 3
gautam's new position: 74
Player name: mukesh Player position: 67 hasStarted: true
Dice value: 2
mukesh's new position: 69
Player name: gautam Player position: 74 hasStarted: true
Dice value: 4
gautam's new position: 78
Player name: mukesh Player position: 69 hasStarted: true
Dice value: 2
mukesh's new position: 71
Player name: gautam Player position: 78 hasStarted: true
Dice value: 3
gautam's new position: 81
Player name: mukesh Player position: 71 hasStarted: true
Dice value: 3
mukesh's new position: 74
Player name: gautam Player position: 81 hasStarted: true
Dice value: 6
gautam's new position: 87
Player name: mukesh Player position: 74 hasStarted: true
Dice value: 3
mukesh's new position: 77
Player name: gautam Player position: 87 hasStarted: true
Dice value: 1
gautam's new position: 88
Player name: mukesh Player position: 77 hasStarted: true
Dice value: 1
mukesh's new position: 78
Player name: gautam Player position: 88 hasStarted: true
Dice value: 6
gautam's new position: 94
Player name: mukesh Player position: 78 hasStarted: true
Dice value: 3
mukesh's new position: 81
Player name: gautam Player position: 94 hasStarted: true
Dice value: 6
gautam's new position: 100
Winner of the Game is: gautam Congratulations!!!

-------Final Score-------
gautam: 100
mukesh: 81
</pre>