package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.principals.*;
import fabric.util.Map;

public interface Create extends fabric.lang.Object {
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.Create {
        public static void main(fabric.lang.arrays.ObjectArray arg1) {
            calendar.Create._Impl.main(arg1);
        }
        
        public _Proxy(Create._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.Create {
        public static void main(fabric.lang.arrays.ObjectArray args) {
            {
                fabric.worker.transaction.TransactionManager $tm4 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled7 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff5 = 1;
                boolean $doBackoff6 = true;
                $label0: for (boolean $commit1 = false; !$commit1; ) {
                    if ($backoffEnabled7) {
                        if ($doBackoff6) {
                            if ($backoff5 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff5);
                                        break;
                                    }
                                    catch (java.lang.InterruptedException $e2) {
                                        
                                    }
                                }
                            }
                            if ($backoff5 < 5000) $backoff5 *= 2;
                        }
                        $doBackoff6 = $backoff5 <= 32 || !$doBackoff6;
                    }
                    $commit1 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        fabric.worker.Store
                          store =
                          fabric.worker.Worker.
                          getWorker().
                          getStore(
                            calendar.Config._Static._Proxy.$instance.
                                get$calendarStoreName());
                        fabric.lang.security.AbstractPrincipal
                          servlet =
                          (fabric.principals.ServletPrincipal)
                            fabric.lang.Object._Proxy.
                            $getProxy(
                              fabric.lang.security.DelegatingPrincipal._Impl.
                                  $addDefaultDelegates(
                                    (fabric.principals.ServletPrincipal)
                                      new fabric.
                                        principals.
                                        ServletPrincipal.
                                        _Impl(
                                        calendar.Create._Static._Proxy.
                                          $instance.
                                            $getStore()).
                                      $getProxy()))._Impl.
                          getInstance();
                    }
                    catch (final fabric.worker.RetryException $e2) {
                        $commit1 = false;
                        continue $label0;
                    }
                    catch (final fabric.worker.
                             TransactionRestartingException $e2) {
                        $commit1 = false;
                        fabric.common.TransactionID $currentTid3 =
                          $tm4.getCurrentTid();
                        if ($e2.tid.isDescendantOf($currentTid3))
                            continue $label0;
                        if ($currentTid3.parent != null) throw $e2;
                        throw new InternalError(
                                "Something is broken with " +
                                    "transaction management. Got a signal to restart a " +
                                    "different transaction than the one being managed.");
                    }
                    catch (final Throwable $e2) {
                        $commit1 = false;
                        if ($tm4.checkForStaleObjects()) continue $label0;
                        throw new fabric.worker.AbortException($e2);
                    }
                    finally {
                        if ($commit1) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e2) {
                                $commit1 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e2) {
                                $commit1 = false;
                                fabric.common.TransactionID $currentTid3 =
                                  $tm4.getCurrentTid();
                                if ($currentTid3 != null) {
                                    if ($e2.tid.equals($currentTid3) ||
                                          !$e2.tid.isDescendantOf(
                                                     $currentTid3)) {
                                        throw $e2;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit1) {
                            {  }
                            continue $label0;
                        }
                    }
                }
            }
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.Create._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
        }
        
        public _Impl(fabric.worker.Store store, long onum, int version,
                     fabric.worker.Store labelStore, long labelOnum,
                     fabric.worker.Store accessPolicyStore,
                     long accessPolicyOnum, java.io.ObjectInput in,
                     java.util.Iterator refTypes,
                     java.util.Iterator intraStoreRefs,
                     java.util.Iterator interStoreRefs)
              throws java.io.IOException,
            java.lang.ClassNotFoundException {
            super(store, onum, version, labelStore, labelOnum,
                  accessPolicyStore, accessPolicyOnum, in, refTypes,
                  intraStoreRefs, interStoreRefs);
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.Create._Static {
            public _Proxy(calendar.Create._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.Create._Static $instance;
            
            static {
                calendar.
                  Create.
                  _Static.
                  _Impl
                  impl =
                  (calendar.Create._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.Create._Static._Impl.class);
                $instance = (calendar.Create._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.Create._Static {
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            }
            
            public _Impl(fabric.worker.Store store, long onum, int version,
                         fabric.worker.Store labelStore, long labelOnum,
                         fabric.worker.Store accessPolicyStore,
                         long accessPolicyOnum, java.io.ObjectInput in,
                         java.util.Iterator refTypes,
                         java.util.Iterator intraStoreRefs,
                         java.util.Iterator interStoreRefs)
                  throws java.io.IOException,
                java.lang.ClassNotFoundException {
                super(store, onum, version, labelStore, labelOnum,
                      accessPolicyStore, accessPolicyOnum, in, refTypes,
                      intraStoreRefs, interStoreRefs);
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.Create._Static._Proxy(this);
            }
            
            private void $init() {  }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 26, -76, -18, -56, -15,
    -49, -122, -1, -110, 99, -36, -73, -35, 75, 73, -81, -28, -91, 91, -100,
    -71, -102, -117, -36, -124, 55, -30, -64, -123, 7, -82, 39 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511876154000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}
