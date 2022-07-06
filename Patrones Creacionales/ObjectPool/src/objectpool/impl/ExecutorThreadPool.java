package objectpool.impl;

import objectpool.impl.factory.IPoolableObjectFactory;
import objectpool.impl.poolable.ExecutorTask;

/**
 * Created with IntelliJ IDEA
 * Created By Robert Vásquez
 * Date: 6/7/22
 * Time: 2:31 p. m.
 */

public class ExecutorThreadPool extends AbstractObjectPool<ExecutorTask>{
  public ExecutorThreadPool(int minInstances, int maxInstances, int waitTime, IPoolableObjectFactory<ExecutorTask> poolableObjectFactory){
      super(minInstances, maxInstances, waitTime, poolableObjectFactory);
  }

}
