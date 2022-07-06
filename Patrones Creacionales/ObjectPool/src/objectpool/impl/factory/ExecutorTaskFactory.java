package objectpool.impl.factory;

import objectpool.impl.poolable.ExecutorTask;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:33 p. m.
 */

public class ExecutorTaskFactory implements IPoolableObjectFactory<ExecutorTask> {
  @Override
  public ExecutorTask createNew() {
    return new ExecutorTask();
  }
}
