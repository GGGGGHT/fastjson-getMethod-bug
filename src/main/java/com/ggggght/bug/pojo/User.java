package com.ggggght.bug.pojo;


/**
 * @author admin
 */
public class User {
  private Boolean a;

  public Boolean isA() {
    return true;
  }

  public Boolean getA() {
    return a;
  }

  public void setA(Boolean a) {
    this.a = a;
  }

  @Override public String toString() {
    return "User{" + "a=" + a + '}';
  }
}
