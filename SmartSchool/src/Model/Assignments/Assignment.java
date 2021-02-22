/*
 * Smart School App
 * This Application was made for students to keep track of their college duties.
 * It cannot be distributed or sold without the permission of the author.
 * @author Raul Gutierrez Niubo
 * website: raulgutierrezniubo.com
 */
package Model.Assignments;

public class Assignment {
    
    private String id;
    private String name;
    private String classItBelongs;
    private String duedate;
    private String username;

    public Assignment(String id, String name, String classItBelongs, String duedate, String username) {
        this.id = id;
        this.name = name;
        this.classItBelongs = classItBelongs;
        this.duedate = duedate;
        this.username = username;
    }
    
    
    
    
}
