/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
public class Lesson {
    int lessonID; 
    int subjectID; 
    String content; 
    String lessonName;
    int courseID; 
    String status ;

    public Lesson() {
    }

    public Lesson(int lessonID, int subjectID, String content, String lessonName, int courseID, String status) {
        this.lessonID = lessonID;
        this.subjectID = subjectID;
        this.content = content;
        this.lessonName = lessonName;
        this.courseID = courseID;
        this.status = status;
    }

    public int getLessonID() {
        return lessonID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public String getContent() {
        return content;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getStatus() {
        return status;
    }

    public void setLessonID(int lessonID) {
        this.lessonID = lessonID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lesson{" + "lessonID=" + lessonID + ", subjectID=" + subjectID + ", content=" + content + ", lessonName=" + lessonName + ", courseID=" + courseID + ", status=" + status + '}';
    }

    
    
    
    
}
