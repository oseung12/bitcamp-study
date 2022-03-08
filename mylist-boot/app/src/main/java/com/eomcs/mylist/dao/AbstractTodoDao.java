package com.eomcs.mylist.dao;

import java.util.ArrayList;
import com.eomcs.mylist.domain.Todo;

// 서브 클래스의 공통 분모를 추출하여 수퍼 클래스를 정의할 경우,
// - 보통 이런 수퍼 클래스는 직접 사용하려고 만든 클래스가 아니다.
// - 단지 서브 클래스에게 공통 분모를 물려주려고 만든 클래스이다.
// - 이런 경우 "추상 클래스"로 선언한다.
// - 또한 추상 클래스 만이 추상 메서드를 가질 수 있기 때문에 
//   추상 메서드가 있는 클래스는 반드시 추상 클래스로 선언해야 한다.
// 
public abstract class AbstractTodoDao implements TodoDao {

  protected ArrayList<Todo> todoList = new ArrayList<>(); 

  protected abstract void save() throws Exception;

  @Override
  public int countAll() {
    return todoList.size();
  }

  @Override
  public Object[] findAll() {
    return todoList.toArray();
  }

  @Override
  public void insert(Todo todo) throws Exception {
    todoList.add(todo);
    save();
  }

  @Override
  public Todo findByNo(int no) {
    if (no < 0 || no >= todoList.size()) {
      return null;
    }
    return todoList.get(no);
  }

  @Override
  public int update(int no, Todo todo) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.set(no, todo);
    save();
    return 1;
  }

  @Override
  public int updateDone(int no, boolean done) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.get(no).setDone(done);
    save();
    return 1;
  }

  @Override
  public int delete(int no) throws Exception {
    if (no < 0 || no >= todoList.size()) {
      return 0;
    }
    todoList.remove(no);
    save();
    return 1;
  }

}
