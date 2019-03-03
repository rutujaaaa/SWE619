import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GrowListTest {

 private GrowList<String> listA;
 
 @BeforeEach
 void setUp() throws Exception {
  listA = null;
 }

 @AfterEach
 void tearDown() throws Exception {
  listA = null;
 }

 @Test
 public void testEmptyList() {
  listA = new GrowList<String>();
  String str = listA.toString();
  assertTrue ("testEmptyList", str.equals("[]"));
 }

 @Test
 public void testAdd() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  String str = listA.toString();
  assertTrue ("testAdd", str.equals("[cat,dog]"));
 }
 
 @Test
 public void testSize() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  
  int mySize = listA.size();
  assertTrue ("testSize", mySize == 2);
 }
 
 @Test
 public void testValidGet0stElement() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  
  String str = listA.get(0);
  assertTrue ("testValidGet0stElement", str.equals("cat"));
 }
 
 @Test
 public void testInValidGetSecondElement() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  
  try {
   String str = listA.get(2);
  } catch (IndexOutOfBoundsException e) {
   return;
  }
  fail ("testInValidGetSecondElement IndexOutOfBoundsException expected");
 }
 
 
 @Test
 public void testValidSet0stElement() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  
  listA = listA.set(0, "bat");
  String str = listA.get(0);
  assertTrue ("testValidSet0stElement", str.equals("bat"));
 }
 
 
 @Test
 public void testInValidSetSecondElement() {
  listA = new GrowList<String>();
  
  listA = listA.add("cat");
  listA = listA.add("dog");
  
  try {
   listA = listA.set(2, "bat");
  } catch (IndexOutOfBoundsException e) {
   return;
  }
  fail ("testInValidSetSecondElement IndexOutOfBoundsException expected");
 }
}
