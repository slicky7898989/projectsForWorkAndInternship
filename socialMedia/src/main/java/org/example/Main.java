package org.example;

import java.util.Scanner;

public class Main extends putTogether
{

    public static void main(String[] args)
    {
        Main gh = new Main();
        for(int z = 0;z<4;z++)
        {
            //gh.add();
        }
        //gh.edit();
        //gh.delete();
        //gh.show();
        //gh.sd();



        int ggh = 0;
        Scanner jk = new Scanner(System.in);
        int h = 0;

        do
        {
            ggh = 0;
            try
            {
                System.out.println("1. Add a Post");
                System.out.println("2. Edit a Post");
                System.out.println("3. Show Posts");
                System.out.println("4. Delete a Post");
                System.out.println("5. See how the Posts are doing");
                System.out.println("6. Exit");
                h = jk.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                jk.nextLine();
                ggh = 0;
            }

            if(h != 1 && h != 2 && h != 3 && h != 4 && h != 5 && h != 6)
            {
                System.out.println("Only Numbers 1-6");
                ggh = 0;
            }
            switch (h)
            {
                case 1:
                    gh.add();
                    break;
                case 2:
                    gh.edit();
                    break;
                case 3:
                    gh.show();
                    break;
                case 4:
                    gh.delete();
                    break;
                case 5:
                    gh.sd();
                    break;
                case 6:
                    System.out.println("Thanks for using! ");
                    ggh = 1;
                    break;
            }
        }while (ggh == 0);
    }
}

/**
 * Input:
 * Poster Name
 * Post Name
 * Post Description
 * Number of likes
 *
 * 1. Add Post
 * 2. See All Posts
 * 3. Update Posts
 * 4. Delete Posts
 * 5. Search for the engagement
 * **/