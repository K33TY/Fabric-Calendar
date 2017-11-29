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
    
    public static final byte[] $classHash = new byte[] { -104, 59, -118, -127,
    110, 86, 39, -26, 119, 93, 24, 123, 65, -38, 114, -5, 61, -126, 8, 93, -66,
    -35, -72, 93, -81, -48, 82, -62, 48, -1, -21, -42 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511994481000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}
