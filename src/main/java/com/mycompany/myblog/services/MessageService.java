/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myblog.services;

import com.mycompany.myblog.models.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vvtat
 */
public class MessageService {
    public static List<Message> list = new ArrayList<>();
    
    //Creating a non-persistent data set (persistent data is from files/database)
    public MessageService(){
        Message m1 = new Message(1, "First", "Manuel");
        Message m2 = new Message(2, "Second", "Jack");
        
        list.add(m1);
        list.add(m2);
    }
    
    public Message getMessage(int id){
        return list.get(id-1);
    }
    
    public List<Message> getAllMessages(){
        return list;
    }
}
