import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
public class DrawMyThingBeta
{
    public static void main(String args[])
    {
        //All Words Possible
        String []lettersThree = {"axe","bow","boy","car","eye","fat","pig","sun"};
        String []lettersFour = {"ants","baby","bank","bear","beer","bird","boat","book","bowl","burn","cake","chef","cold","crab","desk","dice","eggs","face","fall","farm","fire","flag","frog","gift","hand","hang","hair","hobo","hook","jump","king","kiss","lamp","lava","lion","math","milk","moon","neck","pool","poop","pull","rain","roll","rose","sock","soup","tail","tent","time","tiny","wind","wolf","worm","xbox","yawn"};
        String []lettersFive = {"acorn","alien","ankle","angel","anvil","armor","bacon","bagel","beans","beard","bench","berry","blood","boots","booty","bread","brush","camel","candy","chair","cheek","chest","cigar","clock","cloud","clown","couch","comet","crowd","dance","darts","disco","donut","dream","dress","drill","drink","drool","earth","elbow","erupt","flint","ghast","giant","golem","grass","grave","guard","igloo","joker","kirby","leash","light","llama","magic","mario","melon","miner","money","moose","mouse","music","night","ninja","ocean","paint","panda","pants","paper","party","pepsi","phone","photo","piano","pizza","plane","plant","prize","punch","puppy","queen","quick","radar","rifle","river","robot","royal","ruler","salsa","screw","shark","sheep","shout","skirt","skull","skunk","skype","slime","sloth","snake","spoon","spray","squid","stain","stamp","stool","storm","stump","sugar","sushi","swing","syrup","tears","thumb","tiger","tooth","torch","towel","tower","trash","truck","vomit","waist","watch","wheat","witch","zebra"};
        String []lettersSix = {"anchor","archer","autumn","bamboo","batman","bikini","booger","branch","bridge","bucket","burger","cactus","camera","carrot","castle","cereal","cheese","cinema","coffee","cookie","crying","desert","domino","dragon","family","finger","flower","forest","frozen","galaxy","grapes","guitar","hammer","laptop","letter","lizard","monkey","mudkip","muffin","nether","pencil","picnic","pillow","pirate","pistol","piston","planet","police","prison","rabbit","school","shield","shorts","skinny","smiley","spider","spring","sprout","sponge","stable","summer","teapot","temple","toilet","tomato","tetris","turtle","violin","window","winter","wither","wizard","yoshi","zipper","zombie"};
        String []lettersSeven = {"alcohol","america","baggage","battery","blanket","capture","chicken","chimney","coconut","compass","creeper","cupcake","cyclops","fishing","frisbee","hamster","iceberg","mansion","muscles","noodles","pancake","penguin","pikachu","plumber","present","pumpkin","pyramid","shotgun","snorlax","snowman","stomach","sunrise","toaster","tornado","twitter","unicorn","volcano","yelling","youtube"};
        String []lettersEight = {"balloons","bookcase","campfire","cannibal","computer","confused","diamonds","dinosaur","elephant","elevator","emeralds","facebook","fighting","football","iceberg","keyboard","lollipop","mineplex","mushroom","nintendo","notebook","obsidian","pokeball","pregnant","skeleton","sleeping","squirrel","superman","swimming","treehouse","umbrella","uppercut","windmill"};
        String []lettersNine = {"alligator","astronaut","bumblebee","butterfly","chocolate","explosion","handcuffs","jellyfish","letterbox","lightning","minecraft","motorbike","sideburns","snowflake","spaceship","spaghetti","speedboat","staircase","telphone","telescope"};
        String []lettersTen = {"basketball","calculator","charmander","chestplate","helicopter","sunglasses","television"};
        String []lettersEleven = {"playstation"};
        String []wordsTwo = {"belly button  ","camp fire     ","christmas tree","door knob     ","ender dragon  ","fishing rod   ","golf club     ","grim reaper   ","harry potter  ","horse riding  ","holding hands ","ice cream     ","james bond    ","mountain bike ","nether portal ","night time    ","pumpkin pie   ","santa hat     ","stop sign     ","tennis racket ","top hat       ","traffic lights","troll face    ","water gun     ","zombie pigman "};
        String []wordsThree = {"draw my thing","hot air balloon","pot of gold","salt and pepper"};

        System.out.println("Draw My Thing Cheat Version 1.0\nHow many letters/words? [format: \"three\", \"three words\"]");
        Scanner kbReader = new Scanner(System.in);
        String choice = kbReader.nextLine();

        if((choice.equals("three"))||(choice.equals("3")))
        {
            System.out.println("--------------------");
            for(int x = 0; x < lettersThree.length; x++)
            {
                System.out.println(lettersThree[x]);
            }
            System.out.println("--------------------");
        }

        if((choice.equals("four"))||(choice.equals("4")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersFour.length; x++)
            {
                System.out.println(lettersFour[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }

            //Updated Words
            Scanner kbReader2 = new Scanner(System.in);
            System.out.print("Hint: ");
            String choice2 = kbReader2.nextLine();
            System.out.print("Position: ");
            int position2 = kbReader2.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice) && lettersFour[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice && lettersFour[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice) && lettersFour[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice && lettersFour[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice) && lettersFour[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice && lettersFour[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFour.length; x++)
                {
                    if(lettersFour[x].contains(choice) && lettersFour[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice.charAt(0);
                        if(lettersFour[x].charAt(position-1)==reChoice && lettersFour[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFour[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("five"))||(choice.equals("5")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersFive.length; x++)
            {
                System.out.println(lettersFive[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }

            //Updated Words
            Scanner kbReader2 = new Scanner(System.in);
            System.out.print("Hint: ");
            String choice2 = kbReader2.nextLine();
            System.out.print("Position: ");
            int position2 = kbReader2.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice) && lettersFive[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice && lettersFive[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice) && lettersFive[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice && lettersFive[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice) && lettersFive[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice && lettersFive[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice) && lettersFive[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice && lettersFive[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersFive.length; x++)
                {
                    if(lettersFive[x].contains(choice) && lettersFive[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersFive[x].charAt(position-1)==reChoice && lettersFive[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersFive[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("six"))||(choice.equals("6")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersSix.length; x++)
            {
                System.out.println(lettersSix[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }

            //Updated Words
            Scanner kbReader2 = new Scanner(System.in);
            System.out.print("Hint: ");
            String choice2 = kbReader2.nextLine();
            System.out.print("Position: ");
            int position2 = kbReader2.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSix.length; x++)
                {
                    if(lettersSix[x].contains(choice) && lettersSix[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSix[x].charAt(position-1)==reChoice && lettersSix[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSix[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("seven"))||(choice.equals("7")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersSeven.length; x++)
            {
                System.out.println(lettersSeven[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==7)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }

            //Updated Words
            Scanner kbReader2 = new Scanner(System.in);
            System.out.print("Hint: ");
            String choice2 = kbReader2.nextLine();
            System.out.print("Position: ");
            int position2 = kbReader2.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==7)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersSeven.length; x++)
                {
                    if(lettersSeven[x].contains(choice) && lettersSeven[x].contains(choice2))
                    {
                        char reChoice = choice.charAt(0);
                        char reChoice2 = choice2.charAt(0);
                        if(lettersSeven[x].charAt(position-1)==reChoice && lettersSeven[x].charAt(position2-1)==reChoice2)
                        {
                            System.out.println(lettersSeven[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("eight"))||(choice.equals("8")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersEight.length; x++)
            {
                System.out.println(lettersEight[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==7)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==8)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersEight.length; x++)
                {
                    if(lettersEight[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersEight[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersEight[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("nine"))||(choice.equals("9")))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < lettersNine.length; x++)
            {
                System.out.println(lettersNine[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==7)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==8)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==9)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < lettersNine.length; x++)
                {
                    if(lettersNine[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(lettersNine[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(lettersNine[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("ten"))||(choice.equals("10")))
        {
            System.out.println("--------------------");
            for(int x = 0; x < lettersTen.length; x++)
            {
                System.out.println(lettersTen[x]);
            }
            System.out.println("--------------------");
        }

        if((choice.equals("eleven"))||(choice.equals("11")))
        {
            System.out.println("--------------------");
            for(int x = 0; x < lettersEleven.length; x++)
            {
                System.out.println(lettersEleven[x]);
            }
            System.out.println("--------------------");
        }

        if(choice.equals("two words")||choice.equals("2 words"))
        {
            //All Words
            System.out.println("--------------------");
            for(int x = 0; x < wordsTwo.length; x++)
            {
                System.out.println(wordsTwo[x]);
            }
            System.out.println("--------------------");

            //Updated Words
            System.out.print("Hint: ");
            choice = kbReader.nextLine();
            System.out.print("Position: ");
            int position = kbReader.nextInt();

            if(position==1)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==2)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==3)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==4)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==5)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==6)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==7)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==8)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==9)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==10)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==11)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==12)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==13)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
            else if(position==14)
            {
                System.out.println("------------------------------");
                for(int x = 0; x < wordsTwo.length; x++)
                {
                    if(wordsTwo[x].contains(choice))
                    {
                        char reChoice = choice.charAt(0);
                        if(wordsTwo[x].charAt(position-1)==reChoice)
                        {
                            System.out.println(wordsTwo[x]);
                        }
                    }
                }
                System.out.println("------------------------------");
            }
        }

        if((choice.equals("three words"))||(choice.equals("3 words")))
        {
            System.out.println("--------------------");
            for(int x = 0; x < wordsThree.length; x++)
            {
                System.out.println(wordsThree[x]);
            }
            System.out.println("--------------------");
        }
    }
}
