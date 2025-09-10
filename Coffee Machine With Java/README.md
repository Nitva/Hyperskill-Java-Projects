### This is a project made following a study plan from Hyperskill.

# Coffee Machine Simulator

## What does it do?
This project consist of a simulated coffee machine where you can:
- Choose to buy a coffee (capuccino, expresso, or latte)
- See how much of the ingredients( water, coffee, milk...) are left in the machine.
- Refill the machine with those engredients.
- Take the money you have earned from the coffee or just exit the machine.

## How to make it work
When you first execute the program, it will set all the values of the milk, coffee, water, and the rest of the ingredients.
>   water = 400 ml
    milk = 540 ml
    coffee = 120 g
    cups = 9 unit
    money = 550 €

And each time you ask for a coffee, it subtracts the quantity required for each coffee.

1. Coffee espresso 
    - Water 250 ml
    - Grams of coffee 16g
    - Price 4 €
2. Coffee latte 
    - Water 350 ml
    - Milk 75 ml
    - Grams of coffee 20g
    - Price 7€
3. Coffee cappuccino 
    - Water 200 ml
    - Milk 100 ml
    - Grams of coffee 12g
    - Price 6€

## Command explanation
1. Buy
    It lets you choose between 3 kinds of coffee (1. expresso, 2. latte, 3. cappuccino)
2. Fill
    It lets you fill the machine with the amount of ingredients you want.
3. Take
    Take the money generated from selling coffee from the machine.
4. Clean
    Cleans the machine; every 10 coffees it needs to be cleaned.
5. Remaining
    Shows the remaining quantity of ingredients.
6. Exit
    Exits the program.

## First time you boot the program

When you execute this program, it shows this message.
>Write action (buy, fill, take, clean, remaining, exit):

then you need to pick one of the options that it shows, for example I am going to buy an expresso so I will write "buy" and the press enter

>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy<br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 

I will choose 1, so it will give me the espresso
>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy<br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: <br>
\$ 1<br>
I have enough resources, making you a coffee!<br>
Write action (buy, fill, take, clean, remaining, exit): 

Now it asks me for another action; I can buy another coffee if i want, Let's try asking for a latte.

>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy<br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: <br>
\$ 1<br>
I have enough resources, making you a coffee!<br>
Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy<br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: <br>
\$ 2<br>
Sorry, not enough water!<br>
Write action (buy, fill, take, clean, remaining, exit): 

As we can see, it doesn't have enough water. That is because each time we ask for a coffee it subtracts the ingredients from the total amount that we have, Let's refill it so we can drink some capuccino, the coffee machine now has
>The coffee machine has: <br>
150 ml of water <br>
540 ml of milk <br>
104 g of coffee beans <br>
8 disposable cups <br>
$554 of money <br>

And we know that because instead of the command "buy" I used the command "remaining", We need more water so lets "fill" it.
>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ fill <br>
Write how many ml of water you want to add:<br>
\$ 200<br>
Write how many ml of milk you want to add: <br>
\$ 0<br>
Write how many grams of coffee beans you want to add: <br>
\$ 0 <br>
Write how many cups of coffee you will need:<br>
\$ 0

Now we can buy the cappuccino.

>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy <br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: <br>
\$ 3<br>
I have enough resources, making you a coffee!

If you ask for 10 coffees in a row it will show that the machine needs cleaning.
>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ buy<br>
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: <br>
\$ 1<br>
I have enough resources, making you a coffee!<br>
I need cleaning!

and it won't let you ask for more coffees until you clean it with the command "clean".

>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ clean<br>
I have been cleaned!

Finally, you can take all the money you have earned with this machine.
>Write action (buy, fill, take, clean, remaining, exit): <br>
\$ take<br>
I gave you 588€

To exit the program, just type the command "exit"

## Thanks
Thanks for your time; this is my first-ever upload to GitHub and my first project that I have made. <3

I loved each part of it; I hope this is just the beginning of something big.

