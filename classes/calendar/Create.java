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
    
    public static final byte[] $classHash = new byte[] { 17, 120, 12, -65, 104,
    -73, -84, 25, -103, -57, -40, 19, 41, -99, 47, -43, -118, 34, -25, -78,
    -100, 93, -63, 67, 75, 84, -61, -27, -53, -37, 87, 53 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511994732000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "H4sIAAAAAAAAAK1Xb2wcxRWfO5/PvuDk/IcEbGLHcdyghORWoa0qev2Hj4QcOTdWnNDiNBxzu3PnxXu7y+ycc6E1opWqRHzIBzApkUg+pYJSN0hIiA+VVaqWf0qFVNQCFaLkSwQojVRUtc2HtvS9mb3bvb2L+6Un7ezczHtv3rw/v/d25Rrp9jiZKNOSaWXECZd5mX20lC/MUO4xI2dRzzsMq0X9pkT+zCfPGWNxEi+QPp3ajm3q1CraniAbCg/TRarZTGhHDuWzR0lKR8b91JsXJH50qs7JuOtYJyqWI/xD2uQ/fYe2/JMH+1/qIuk5kjbtWUGFqeccW7C6mCN9VVYtMe7dbRjMmCMDNmPGLOMmtcxHgdCx58igZ1ZsKmqceYeY51iLSDjo1VzG5ZmNRVTfAbV5TRcOB/X7lfo1YVpawfREtkCSZZNZhvcIeYwkCqS7bNEKEG4qNG6hSYnaPlwH8nUmqMnLVGcNlsSCaRuCbIlyNG88eQAIgLWnysS80zwqYVNYIINKJYvaFW1WcNOuAGm3U4NTBBm5oVAg6nWpvkArrCjIrVG6GbUFVClpFmQRZGOUTEoCn41EfBby1rVvf+309+39dpzEQGeD6Rbq3wtMYxGmQ6zMOLN1phj7dhbO0E2rp+KEAPHGCLGieeUHn31r19irbyqa2zrQHCw9zHRR1C+UNvx+c27HXV2oRq/reCaGQsvNpVdn/J1s3YVo39SUiJuZxuarh15/4PEX2NU4WZcnSd2xalWIqgHdqbqmxfi9zGacCmbkSYrZRk7u50kPzAumzdTqwXLZYyJPEpZcSjryP5ioDCLQRD0wN+2y05i7VMzLed0lhPTAQ2LwbCEk/pq/ADk0rR3xIPi1vRjtJQgY7R7mLQjH1ab32pXiDHfQHlqOWqAD5bshhbmpax7XNd1f03KcgfYZUMT9fwus4w36j8diYNwtumOwEvXAU37UTM1YkBj7HctgvKhbp1fzZGj1rIycFEa7BxErbRMDb2+O4kSYd7k2tfezi8VLKuqQ1zedIOmGWhmlFmjShymUAVDKACitxOqZ3Pn8z2WkJD2ZUk3mFMDfVy0HRNRJLCavcbNklvEB3l0A1ABg6Nsxe+y+h05NdEFguscT6CsgnYymSQAueZhRiP2inj75yT9ePLPkBAkjyGRbHrdzYh5ORG3CHZ0ZgHOB+J3j9OXi6tJkHDEkBfAmKAQgYMVY9IyWfMw2sA1N0V0gN5UdXqUWbjUAaZ2Y587xYEX6egMOg8rtaKyIghIWvz7rnnv/7U+/KAtGA0HTIaidZSIbyloUlpb5ORDY/jBnDOg+fGbmqaevnTwqDQ8U2zodOIljDrKVQpo6/MdvPvKnj/584Q/xwFmCJN1ayTL1urzLwOfwi8HzH3ww9XAB3wDAOT/tx5t57+LJ2wPdAAEsSBJQ3Zs8YlcdwyybtGQxjJR/pb+w5+W/nO5X7rZgRRmPk13/W0CwPjxFHr/04D/HpJiYjhUosF9ApmBtKJB8N+f0BOpR/+E7o2ffoOcg7AGUPPNRJnGGSHsQ6cA7pS12y3FPZO9LOEwoa2321+WfbXLcjsMOZVuc7vTtSvxf0kewiv+muDvk4nhzq0xORm9UbGShvPCj5fPGwZ/uUSVhsBXA99q16i/e/ffvMs9cfqsDNKQA1nZbbJFZoTMxcbe2dT3TshYHaXX56uhduYUrFXXsloiKUeqfTa+8de92/ck46WrmeFsD0MqUDSsLycYZ9C82XhtX1kknjDeNmkZj3Q7PIFyA+u98yKh+Rnb0UFx6SCD4YWcVuArrDdngS9vvv7NRVwUBEmsacDRiQCgRMvJUGX/7uevDq5OfXlfGizYTIcK/rnx09Z31oxcleCWwdsjLR7uw9iarpXeSd+9r3mqYqDIqb/OA/54N20qSboT2T+YNtloZ1WrJjWFB+rAsuBYViIr1DveP9jr7UN0gHua0lWdHct+4qkpdE5RRztYOpe5+GqoXd75Q/Xt8IvlanPTMkX7Zr1Jb3E+tGuLhHBjDy/mLBbK+Zb+1e1StUrYZkJujARk6NloOwqGZEC1BKSvAdD1GXEk82/yLk++uHYHdZdOmqmm4A+IR6nZFzHcw5ww3q1AaFv3WkZ1afuLzzOllleKqv97W1uKGeVSPLQ9aL09DoNm61imSY9/HLy798vmlk3EfBbOCdEHs4bSwJvrJM3D4Hg5FyRDETVwZoRF2Q0HY5SzHZoj8uDXSIFAtiOlkmt85DYr2WMT/31Q+CKmJw1ekUmtgvL3GnvTmAnhMRw07JIyKLqWU5MivIa2Gw5QgiSrkgaQ45nsFXw/BxqJjGnUICdXDYVG7rUM76X/g6LnfsgtXDuzaeINW8ta2T06f7+L5dO8t54+8p/Cm8fGSgl6kXLOscMyH5kmXs7Ip75FSGeDK15IgvY3eE/8/5rY4cbAsYTFsrc7wIoWN1Dh+L6/87Zbryd7Dl2XrAtYbH6j3/Wr+lZXhs2+8P7TjnPbHJyY+funZY7/OHTj8myuXPvjOl/8LWbk2iscPAAA=";
}
