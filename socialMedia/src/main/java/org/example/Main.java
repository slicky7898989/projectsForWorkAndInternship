package org.example;

public class Main extends putTogether
{

    public static void main(String[] args)
    {
        Main gh = new Main();
        for(int z = 0;z<2;z++)
        {
            gh.add();
        }
        //gh.edit();
        gh.delete();
        gh.show();
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