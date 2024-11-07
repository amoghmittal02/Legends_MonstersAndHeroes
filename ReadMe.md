# CS611-Assignment 4
# Legends : Monsters and Heroes Game
---------------------------------------------------------------------------
- Name: Amogh Mittal
- Email: amittal2@bu.edu
- Student ID: U65464717

## Files
---------------------------------------------------------------------------

Main.java - Executes the Game file

Armor.java - Defines Armor, which is a type of an item

Armory.java - Access all types of armors possible

Battle.java - Implements the battle between Monsters and Heroes

Character.java - Defines a character, parent class for monsters as well as heroes

Dragon.java - Defines dragon, which is a type of monster

DragonDen.java - Access all types of Dragons

Exoskeleton.java - Defines exoskeleton, which is a type of monster

ExoskeletonCave.java - Access all types of Exoskeletons

Fighter.java - Defines fighter, similar to a warrior, is a typer of hero 

FireSpell.java - Defines Fire Spell, is a type of a spell

FireSpellBook.java - Access all types of Fire Spells available

Game.java - The basic class which starts the game and implements the fundamental functions

Hero.java - Defines hero class, which extends character class

IceSpell.java - Defines Ice Spell, is a type of a spell

IceSpellBook.java - Access all types of Ice Spells available

Inventory.java - Defines the market inventory, contains items

Item.java - Defines items that can be used in a battle

LightningSpell.java - Defines Lightning Spell, is a type of a spell

LightningSpellBook.java - Access all types of Lightning Spells available

Market.java - Defines and implements all the attributes in a market, heroes select items for battle here

Monster.java - Defines a Monster, which is an extension of a character class

MonsterFactory.java - File to apply factory pattern, to create new monsters. Wanted the user to play CPU, hence went for random monster creations

Paladin.java - Defines Paladin, a type of a hero

PaladinOptions.java - Access to all types of Paladins available in the game

Potion.java - Defines potion, which is a type of an item

PotionStore.java - Access to all types of potions heroes can buy and use

Rogue.java - Defines an extra class similar to Sorcerer class, type of a hero

Sorcerer.java - Defines a sorcerer, which is type of a hero

SorcererOptions.java - Access to all types of Sorcerers

Spell.java - Defines spells, which also a type of an item, heroes can use in battle

Spirit.java - Defines spirit, which is a type of monster

SpiritTypes.java - Access to all types of Spirits

Warrior.java - Defines a warrior, which is a type of a hero

WarriorOptions.java - Access to all types of warriors

Weapon.java - Defines weapon, which is a type of item heroes can use in battle

Weaponry.java - Access to all types of weapons

World.java - Defines the map of the game, has various types of tiles like Market, common and invalid

## Notes
---------------------------------------------------------------------------
User can choose the size of the map (from 3x3 to 10x10), feature added in order to make it scalable

Added colors in the map to represent different tiles for a better game experience

Colors added in the terminal for monster and hero battles, for a clear game understanding

Movement is by WASD keys on the keyboard, instead of inputing a columns and row position in the map everytime, makes the user experience better

User can press Q to quit, I for information on current status of heroes

User can press M to access market, but ONLY when on the market tile, else pressing M won't result in market access

Game gets over when all heroes are dead

Monsters attack random heroes (it is like you are playing with CPU)


## How to compile and run
---------------------------------------------------------------------------
Your directions on how to run the code. Make sure to be as thorough as possible!

1. Navigate to the directory <<#YourCodeDirectory>> after unzipping the files
2. Run the following instructions:
   javac *.java
   java Main


## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. Label each text with input and output. For example:

```
    < PLAY THROUGH HERE >


Welcome to Legends: Monsters and Heroes!
Prepare your heroes and enter the adventure!
Enter world size (3-10): 
8
Enter number of heroes (1-3): 
3
Choose hero 1 type:
1. Warrior
2. Sorcerer
3. Paladin
1
Enter hero name: Amogh
Choose hero 2 type:
1. Warrior
2. Sorcerer
3. Paladin
2
Enter hero name: Amey
Choose hero 3 type:
1. Warrior
2. Sorcerer
3. Paladin
3
Enter hero name: Messi
H C C C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
s
Current Position: (0, 0)
Received Direction: s
Moved to Position: (1, 0)
C C C C C C M C 
H C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
a
Current Position: (1, 0)
Received Direction: a
Cannot move in that direction. It's inaccessible.
C C C C C C M C 
H C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
m

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit
Buy or Sell? (B/S): 
b

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 1000
Current Level: 1
1
Available Weapons:
1. Sword (Price: 500, Level: 1, Damage: 75, Hands Required: 1)
2. Bow (Price: 300, Level: 2, Damage: 500, Hands Required: 2)
3. Scythe (Price: 1000, Level: 6, Damage: 1100, Hands Required: 2)
4. Axe (Price: 550, Level: 5, Damage: 850, Hands Required: 1)
5. TSwords (Price: 1400, Level: 8, Damage: 1600, Hands Required: 2)
6. Dagger (Price: 200, Level: 1, Damage: 25, Hands Required: 1)

Choose a weapon to buy (1-6) or 0 to cancel:
1
Amogh bought Sword!
Weapon damage: 75, Hands required: 1

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 500
Current Level: 1
0
Thank you for visiting the market!

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit
Buy or Sell? (B/S): 
b

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 1000
Current Level: 1
1
Available Weapons:
1. Sword (Price: 500, Level: 1, Damage: 75, Hands Required: 1)
2. Bow (Price: 300, Level: 2, Damage: 500, Hands Required: 2)
3. Scythe (Price: 1000, Level: 6, Damage: 1100, Hands Required: 2)
4. Axe (Price: 550, Level: 5, Damage: 850, Hands Required: 1)
5. TSwords (Price: 1400, Level: 8, Damage: 1600, Hands Required: 2)
6. Dagger (Price: 200, Level: 1, Damage: 25, Hands Required: 1)

Choose a weapon to buy (1-6) or 0 to cancel:
1
Amey bought Sword!
Weapon damage: 75, Hands required: 1

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 500
Current Level: 1
0
Thank you for visiting the market!

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit
Buy or Sell? (B/S): 
b

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 1000
Current Level: 1
1
Available Weapons:
1. Sword (Price: 500, Level: 1, Damage: 75, Hands Required: 1)
2. Bow (Price: 300, Level: 2, Damage: 500, Hands Required: 2)
3. Scythe (Price: 1000, Level: 6, Damage: 1100, Hands Required: 2)
4. Axe (Price: 550, Level: 5, Damage: 850, Hands Required: 1)
5. TSwords (Price: 1400, Level: 8, Damage: 1600, Hands Required: 2)
6. Dagger (Price: 200, Level: 1, Damage: 25, Hands Required: 1)

Choose a weapon to buy (1-6) or 0 to cancel:
1
Messi bought Sword!
Weapon damage: 75, Hands required: 1

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 500
Current Level: 1
3
Available Potions:
1. Healing_Potion (Price: 250, Level: 1, Effect: 100, Type: HEALTH)
2. Strength_Potion (Price: 200, Level: 1, Effect: 75, Type: STRENGTH)
3. Magic_Potion (Price: 350, Level: 2, Effect: 100, Type: MANA)
4. Luck_Elixir (Price: 500, Level: 4, Effect: 65, Type: AGILITY)
5. Mermaid_Tears (Price: 850, Level: 5, Effect: 100, Type: MULTI)
6. Ambrosia (Price: 1000, Level: 8, Effect: 150, Type: MULTI)

Choose a potion to buy (1-6) or 0 to cancel:
1
Messi bought Healing_Potion!
Effect: 100, Type: HEALTH

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 250
Current Level: 1
2
Available Armors:
1. Platinum_Shield (Price: 150, Level: 1, Defense: 200)
2. Breastplate (Price: 350, Level: 3, Defense: 600)
3. Full_Body_Armor (Price: 1000, Level: 8, Defense: 1100)
4. Wizard_Shield (Price: 1200, Level: 10, Defense: 1500)
5. Guardian_Angel (Price: 1000, Level: 10, Defense: 1000)

Choose an armor to buy (1-5) or 0 to cancel:
1
Messi bought Platinum_Shield!
Defense value: 200

Available Categories:
1. Weapons
2. Armors
3. Potions
0. Exit

Choose a category (0-3):
Current Gold: 100
Current Level: 1
0
Thank you for visiting the market!
C C C C C C M C 
H C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (1, 0)
Received Direction: d
Moved to Position: (1, 1)
C C C C C C M C 
M H M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
m
You must be on a market tile to access the market.
C C C C C C M C 
M H M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
i
Amogh - Level: 1, Health: 150/150, Mana: 50/50, Strength: 20, Dexterity: 10, Agility: 15
Gold: 500
Amey - Level: 1, Health: 100/100, Mana: 75/75, Strength: 15, Dexterity: 20, Agility: 20
Gold: 500
Messi - Level: 1, Health: 200/200, Mana: 75/75, Strength: 18, Dexterity: 18, Agility: 12
Gold: 100
C C C C C C M C 
M H M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
w
Current Position: (1, 1)
Received Direction: w
Moved to Position: (0, 1)
C H C C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 1)
Received Direction: d
Moved to Position: (0, 2)
Battle begins!
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
1
Amogh equipped weapon: Sword
Amogh equipped Sword.
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
1
Amey equipped weapon: Sword
Amey equipped Sword.
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
2. Healing_Potion
3. Platinum_Shield
1
Messi equipped weapon: Sword
Messi equipped Sword.
Dragon attacks Amogh!
Amogh takes 20 damage from Dragon!
1. Amogh (HP: 130)
2. Amey (HP: 100)
3. Messi (HP: 200)
Dragon attacks Amogh!
Amogh takes 20 damage from Dragon!
1. Amogh (HP: 110)
2. Amey (HP: 100)
3. Messi (HP: 200)
Exoskeleton attacks Messi!
Messi takes 30 damage from Exoskeleton!
1. Amogh (HP: 110)
2. Amey (HP: 100)
3. Messi (HP: 170)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 100)
2. Dragon (HP: 100)
3. Exoskeleton (HP: 300)
1
Amogh attacks Dragon!
Dragon takes 85 damage!
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 100)
3. Exoskeleton (HP: 300)
2
Amey attacks Dragon!
Dragon takes 80 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 300)
3
Messi attacks Exoskeleton!
Exoskeleton takes 33 damage!
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 110)
2. Amey (HP: 100)
3. Messi (HP: 150)
Dragon attacks Amogh!
Amogh takes 20 damage from Dragon!
1. Amogh (HP: 90)
2. Amey (HP: 100)
3. Messi (HP: 150)
Exoskeleton attacks Amey!
Amey takes 30 damage from Exoskeleton!
1. Amogh (HP: 90)
2. Amey (HP: 70)
3. Messi (HP: 150)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 267)
3
Amogh attacks Exoskeleton!
Exoskeleton takes 35 damage!
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 232)
3
Amey attacks Exoskeleton!
Exoskeleton takes 30 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 202)
3
Messi attacks Exoskeleton!
Exoskeleton takes 33 damage!
Dragon attacks Amey!
Amey takes 20 damage from Dragon!
1. Amogh (HP: 90)
2. Amey (HP: 50)
3. Messi (HP: 150)
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 90)
2. Amey (HP: 50)
3. Messi (HP: 130)
Exoskeleton attacks Amogh!
Amogh takes 30 damage from Exoskeleton!
1. Amogh (HP: 60)
2. Amey (HP: 50)
3. Messi (HP: 130)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 169)
3
Amogh attacks Exoskeleton!
Exoskeleton takes 35 damage!
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 134)
3
Amey attacks Exoskeleton!
Exoskeleton takes 30 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 104)
3
Messi attacks Exoskeleton!
Exoskeleton takes 33 damage!
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 60)
2. Amey (HP: 50)
3. Messi (HP: 110)
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 60)
2. Amey (HP: 50)
3. Messi (HP: 90)
Exoskeleton attacks Amogh!
Amogh takes 30 damage from Exoskeleton!
1. Amogh (HP: 30)
2. Amey (HP: 50)
3. Messi (HP: 90)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 71)
3
Amogh attacks Exoskeleton!
Exoskeleton takes 35 damage!
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 36)
3
Amey attacks Exoskeleton!
Exoskeleton takes 30 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
3
Choose a potion to use:
1. Healing_Potion (Effect: 100)
1
Messi healed by 100 points.
Messi used Healing_Potion.
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 30)
2. Amey (HP: 50)
3. Messi (HP: 170)
Dragon attacks Messi!
Messi takes 20 damage from Dragon!
1. Amogh (HP: 30)
2. Amey (HP: 50)
3. Messi (HP: 150)
Exoskeleton attacks Messi!
Messi takes 30 damage from Exoskeleton!
1. Amogh (HP: 30)
2. Amey (HP: 50)
3. Messi (HP: 120)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
2. Dragon (HP: 20)
3. Exoskeleton (HP: 6)
2
Amogh attacks Dragon!
Dragon takes 85 damage!
Dragon has been defeated!
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Dragon (HP: 15)
3. Exoskeleton (HP: 6)
1
Amey attacks Dragon!
Dragon takes 80 damage!
Dragon has been defeated!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
3. Exoskeleton (HP: 6)
3
Messi attacks Exoskeleton!
Exoskeleton takes 33 damage!
Exoskeleton has been defeated!
Heroes win the battle!
C C H C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
i
Amogh - Level: 1, Health: 30/150, Mana: 50/50, Strength: 20, Dexterity: 10, Agility: 15
Gold: 500
Amey - Level: 1, Health: 50/100, Mana: 75/75, Strength: 15, Dexterity: 20, Agility: 20
Gold: 500
Messi - Level: 1, Health: 120/200, Mana: 75/75, Strength: 18, Dexterity: 18, Agility: 12
Gold: 100
C C H C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 2)
Received Direction: d
Moved to Position: (0, 3)
C C C H C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 3)
Received Direction: d
Moved to Position: (0, 4)
C C C C H C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 4)
Received Direction: d
Moved to Position: (0, 5)
C C C C C H M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
s
Current Position: (0, 5)
Received Direction: s
Moved to Position: (1, 5)
C C C C C C M C 
M C M M X H C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
a
Current Position: (1, 5)
Received Direction: a
Cannot move in that direction. It's inaccessible.
C C C C C C M C 
M C M M X H C M 
M X C M M C X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
s
Current Position: (1, 5)
Received Direction: s
Moved to Position: (2, 5)
C C C C C C M C 
M C M M X C C M 
M X C M M H X X 
X C X M C C C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
s
Current Position: (2, 5)
Received Direction: s
Moved to Position: (3, 5)
C C C C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C H C C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (3, 5)
Received Direction: d
Moved to Position: (3, 6)
Battle begins!
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
1
Amogh equipped weapon: Sword
Amogh equipped Sword.
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
1
Amey equipped weapon: Sword
Amey equipped Sword.
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
4
Choose an item to equip:
1. Sword
2. Platinum_Shield
2
Messi equipped armor: Platinum_Shield
Messi equipped Platinum_Shield.
Exoskeleton attacks Amogh!
Amogh takes 20 damage from Exoskeleton!
1. Amogh (HP: 10)
2. Amey (HP: 50)
3. Messi (HP: 120)
Exoskeleton attacks Amogh!
Amogh takes 20 damage from Exoskeleton!
2. Amey (HP: 50)
3. Messi (HP: 120)
Amogh has been defeated!
Spirit attacks Amey!
Amey takes 15 damage from Spirit!
2. Amey (HP: 35)
3. Messi (HP: 120)
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 200)
2. Exoskeleton (HP: 200)
3. Spirit (HP: 100)
3
Amey attacks Spirit!
Spirit takes 80 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 200)
2. Exoskeleton (HP: 200)
3. Spirit (HP: 20)
3
Messi attacks Spirit!
Spirit takes 83 damage!
Spirit has been defeated!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
2. Amey (HP: 35)
3. Messi (HP: 120)
Exoskeleton attacks Amey!
Amey takes 20 damage from Exoskeleton!
2. Amey (HP: 15)
3. Messi (HP: 120)
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 200)
2. Exoskeleton (HP: 200)
1
Amey attacks Exoskeleton!
Exoskeleton takes 50 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
3
No potions available.
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
2. Amey (HP: 15)
3. Messi (HP: 120)
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
2. Amey (HP: 15)
3. Messi (HP: 120)
Amey's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 150)
2. Exoskeleton (HP: 200)
1
Amey attacks Exoskeleton!
Exoskeleton takes 50 damage!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 100)
2. Exoskeleton (HP: 200)
1
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
2. Amey (HP: 15)
3. Messi (HP: 120)
Exoskeleton attacks Amey!
Amey takes 20 damage from Exoskeleton!
3. Messi (HP: 120)
Amey has been defeated!
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Exoskeleton (HP: 47)
2. Exoskeleton (HP: 200)
1
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton has been defeated!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
3. Messi (HP: 120)
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
2. Exoskeleton (HP: 200)
2
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
3. Messi (HP: 120)
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
2. Exoskeleton (HP: 147)
2
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
3. Messi (HP: 120)
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
2. Exoskeleton (HP: 94)
2
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton attacks Messi!
Messi takes 0 damage from Exoskeleton!
3. Messi (HP: 120)
Messi's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
2. Exoskeleton (HP: 41)
2
Messi attacks Exoskeleton!
Exoskeleton takes 53 damage!
Exoskeleton has been defeated!
Heroes win the battle!
C C C C C C M C 
M C M M X C C M 
M X C M M C X X 
X C X M C C H C 
C X C M C M X C 
X X M X X M M C 
M M C X X M M M 
C C C C C M C C 
Move (WASD), Quit (Q), Info (I), Market (M): 
i
Amogh - Level: 1, Health: 0/150, Mana: 50/50, Strength: 20, Dexterity: 10, Agility: 15
Gold: 500
Amey - Level: 1, Health: 0/100, Mana: 75/75, Strength: 15, Dexterity: 20, Agility: 20
Gold: 500
Messi - Level: 1, Health: 120/200, Mana: 75/75, Strength: 18, Dexterity: 18, Agility: 12
Gold: 100

Welcome to Legends: Monsters and Heroes!
Prepare your heroes and enter the adventure!
Enter world size (3-10): 
10
Enter number of heroes (1-3): 
1
Choose hero 1 type:
1. Warrior
2. Sorcerer
3. Paladin
1
Enter hero name: Amogh
H C M C C X C X M X 
C M C C M M C M X X 
C M C M C C C M C X 
X M C X C M C C X C 
M M C M M M C M C C 
M M X C C C C C C M 
M C C C M C X X M M 
C X M C M C X C C C 
C M C C X C M C M M 
M C M C M C X C M C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 0)
Received Direction: d
Moved to Position: (0, 1)
C H M C C X C X M X 
C M C C M M C M X X 
C M C M C C C M C X 
X M C X C M C C X C 
M M C M M M C M C C 
M M X C C C C C C M 
M C C C M C X X M M 
C X M C M C X C C C 
C M C C X C M C M M 
M C M C M C X C M C 
Move (WASD), Quit (Q), Info (I), Market (M): 
d
Current Position: (0, 1)
Received Direction: d
Moved to Position: (0, 2)
C C H C C X C X M X 
C M C C M M C M X X 
C M C M C C C M C X 
X M C X C M C C X C 
M M C M M M C M C C 
M M X C C C C C C M 
M C C C M C X X M M 
C X M C M C X C C C 
C M C C X C M C M M 
M C M C M C X C M C 
Move (WASD), Quit (Q), Info (I), Market (M): 
s
Current Position: (0, 2)
Received Direction: s
Moved to Position: (1, 2)
Battle begins!
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Spirit (HP: 200)
1
Amogh attacks Spirit!
Spirit takes 0 damage!
Spirit attacks Amogh!
Amogh takes 30 damage from Spirit!
1. Amogh (HP: 120)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Spirit (HP: 200)
1
Amogh attacks Spirit!
Spirit takes 0 damage!
Spirit attacks Amogh!
Amogh takes 30 damage from Spirit!
1. Amogh (HP: 90)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Spirit (HP: 200)
1
Amogh attacks Spirit!
Spirit takes 0 damage!
Spirit attacks Amogh!
Amogh takes 30 damage from Spirit!
1. Amogh (HP: 60)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Spirit (HP: 200)
1
Amogh attacks Spirit!
Spirit takes 0 damage!
Spirit attacks Amogh!
Amogh takes 30 damage from Spirit!
1. Amogh (HP: 30)
Amogh's turn.
Choose an action:
1. Attack
2. Cast Spell
3. Use Potion
4. Equip Item
1
Choose an enemy to attack:
1. Spirit (HP: 200)
1
Amogh attacks Spirit!
Spirit takes 0 damage!
Spirit attacks Amogh!
Amogh takes 30 damage from Spirit!
Amogh has been defeated!
Monsters have defeated the heroes! Game Over!