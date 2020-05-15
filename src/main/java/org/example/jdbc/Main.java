package org.example.jdbc;

import org.example.jdbc.crud.Create;
import org.example.jdbc.crud.Delete;
import org.example.jdbc.crud.Read;
import org.example.jdbc.crud.Update;

public class Main {

    public static void main(String[] args) {
        //READ FROM TABLE
        Read read = new Read();

        //WRITE DO THE TABLE
        Update update = new Update();
        //update.updateRows();

        //CREATE TO THE TABLE
        Create create = new Create();
        //create.createRow();

        //DELETE ROW
        Delete delete = new Delete();
        delete.deleteRow();

        read.readRows();
    }



}
