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
                        fabric.lang.security.AbstractPrincipal servlet =
                          fabric.principals.ServletPrincipal._Impl.getInstance(
                                                                     );
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
    
    public static final byte[] $classHash = new byte[] { -55, 115, -2, -46, -50,
    -8, -53, -79, -73, -19, 37, -98, -87, 122, 44, 98, 35, 66, -47, 17, 63, 64,
    36, -69, -119, 40, 90, 6, -126, -45, 47, -7 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512024876000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}
