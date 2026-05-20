package com.day1project2;

public class Tickets {
private int id;
private String title;
private String Status;
  public Tickets(int id, String title, String status) {
    this.id = id;
    this.title = title;
    this.Status = status;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getStatus() {
    return Status;
  }
  public void setStatus(String status) {
    Status = status;
  } 
  public void displayTicketDetails(){
    System.out.println("Ticket ID: " + id);
    System.out.println("Title: " + title);
    System.out.println("Status: " + Status);
  }
}
