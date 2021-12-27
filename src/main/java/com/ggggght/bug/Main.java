package com.ggggght.bug;

import com.alibaba.fastjson.JSONObject;
import com.ggggght.bug.pojo.User;
import com.google.common.base.Preconditions;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    User user = new User() {{
      setA(false);
    }};

    String jsonString = JSONObject.toJSONString(user);
    User user1 = JSONObject.parseObject(jsonString, User.class);

    Preconditions.checkState(Objects.equals(user1.getA(), user.getA()));
  }
}
