package org.example;

import java.util.HashMap;
import org.example.operations.*;
public class putTogether
{
    public HashMap<Integer,post> postList = new HashMap<>();
    mainList ist;

    public  void  add()
    {
        ist = new add();
        ist.list(postList);
    }

    public  void show()
    {
        ist = new show();
        ist.list(postList);
    }

    public void edit()
    {

        ist = new update();
        ist.list(postList);
    }

    public void delete()
    {
        ist = new delete();
        ist.list(postList);
    }

    public void  sd()
    {
        ist = new postWellness();
        ist.list(postList);
    }

}
