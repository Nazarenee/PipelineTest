package org.example;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1 = new Student("John", 12, 20);
    Student student2 = new Student("mikkel", 15, 10);
    Student student3 = new Student("Tester", 20, 10);

    @BeforeEach
    public void setup() {
        student3.addStudent(student1);
        student3.addStudent(student2);
    }

    @Test
    public void is_test(){
        assertThat(student3.getAge(), is(20));
        assertThat(student3.getName(), is("Tester"));
    }

    @Test
    public void two_is_test(){
        assertThat(student3.getName(), is("Tester"));
        assertThat(student3.getGpa(), is(20));
    }

   @Test
    public void Equal_test() {
        assertEquals(student3.getAge(), 20);
        assertEquals(student3.getName(), "Tester");
    }

    @Test
    public void greater_test(){

        assertTrue(student3.getAge() > 19);
    }

    @Test
    public void contains_string(){
        assertThat(student3.getName(), containsString("Te"));
    }

    @Test
    public void has_size(){
        assertThat(student3.getFriends(), hasSize(2));
    }

    @Test
    public void has_item(){
        assertThat(student3.getFriends(), hasItem(student1));
    }
    @Test
    public void Contains_any_order(){
        assertThat(student3.getFriends(), containsInAnyOrder(student2, student1));
    }

}