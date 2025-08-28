# Poker-Game-Alpha
Very early build of poker game for software engineering
Automatic program which draws, reads hand, maintains and distributes chips.

The player can wager from 1 to 5 credits per game. Once a wager is made, the credits are deducted from
the player’s pot. If the player wins, their payout will be based on the payout chart (located at bottom of this README document)

Still Need:
U.I.
Max player count.
player name and credit input. 
input for bets/wager (1-5 credits), each player.
Deal function for player to press.
options to see/manage hand (5 cards).
function for player to reject none, some, or all cards - replacing from top of deck. returning them to
Shuffle function.
Credit multiplier for each hand/bet.
maintain score for player name between games.
Game ends when one player hits 0 credits.
Quit option.

Project requirements:
a simulation of a popular casino game called video poker. The poker game will follow the
“Jacks or Better” scoring approach. The card deck contains 52 cards, 13 of each suit. At the beginning of
the game, the deck is shuffled. You need to devise a fair method for shuffling. (It does not have to be
efficient.)
A player begins play by entering their name and a beginning amount of credits. A player can continue to
play until they get tired and want to quit or until they run out of credits. The player places a bet of 1-5
credits and then tells the system to “deal” a hand. Then the top five cards of the deck are presented to the
player as their “hand”. The player can reject none, some or all of the cards from their hand. The rejected
cards are replaced from the top of the deck. Now the hand is scored.
Your program should pronounce it to be one of the following:
• Pairs of Jacks or Better - All high pairs (Jack-Jack, Queen-Queen, King-King, Ace-Ace).
• Two Pairs - Two cards of one kind and another two cards of one kind (for example, 3-3
and 6-6).
• Three of a Kind - three cards of one kind (same rank).
• Straight - Five cards of sequential rank (7-8-9-10-Jack).
• Flush - Five cards of the same suit.
• Full House - A combination of Three-of-a-Kind and a Pair.
• Four-of-a-Kind - Four cards of one kind (same rank).
• Straight Flush - Straight of one suit.
• Royal Flush - Ace-High straight of one suit.
The player can wager from 1 to 5 credits per game. Once a wager is made, the credits are deducted from
the player’s pot. If the player wins, their payout will be based on the following payout chart.

Odds for chip payout:
Hand                      Odds      1 Credit 2 Credits 3 Credits 4 Credits 5 Credits
Pair of Jacks or Better   1.36 : 1   1         2         3         4          5
Two pairs                 20.0 : 1   2         4         6         8          10
Three of a Kind           46.3 : 1   3         6         9         12         15
Straight                  254 :  1   4         8         12        16         20
Flush                     508 :  1   6         12        18        24         30
Full House                693 :  1   9         18        27        36         45
Four of a Kind           4,164 : 1   25        50        75        100        125
Straight Flush          72,192 : 1   50        100       150       200        250
Royal Flush 649,739 : 1 250 500 750 1000 4000
 add user input, ability to 
