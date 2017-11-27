package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.util.Map;
import fabric.Config;

public interface HelloServEP extends fabric.lang.security.ExternalPrincipal {
    public fabric.principals.HelloServEP fabric$principals$HelloServEP$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.HelloServEP {
        public fabric.principals.HelloServEP fabric$principals$HelloServEP$() {
            return ((fabric.principals.HelloServEP) fetch()).
              fabric$principals$HelloServEP$();
        }
        
        public static fabric.principals.HelloServEP getInstance() {
            return fabric.principals.HelloServEP._Impl.getInstance();
        }
        
        public static fabric.principals.HelloServEP getInstance(
          fabric.worker.Store arg1) {
            return fabric.principals.HelloServEP._Impl.getInstance(arg1);
        }
        
        public void jif$invokeDefConstructor() {
            ((fabric.principals.HelloServEP) fetch()).jif$invokeDefConstructor(
                                                        );
        }
        
        public static fabric.principals.HelloServEP
          jif$cast$fabric_principals_HelloServEP(fabric.lang.Object arg1) {
            return fabric.principals.HelloServEP._Impl.
              jif$cast$fabric_principals_HelloServEP(arg1);
        }
        
        public _Proxy(HelloServEP._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.HelloServEP {
        public fabric.principals.HelloServEP fabric$principals$HelloServEP$() {
            ((fabric.principals.HelloServEP._Impl) this.fetch()).jif$init();
            { this.fabric$lang$security$ExternalPrincipal$("hello"); }
            return (fabric.principals.HelloServEP) this.$getProxy();
        }
        
        public static fabric.principals.HelloServEP getInstance() {
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
                        fabric.worker.Worker cl =
                          fabric.worker.Worker.getWorker();
                        if (!fabric.lang.Object._Proxy.idEquals(cl, null)) {
                            final fabric.worker.Store
                              helloStore =
                              cl.
                              getStore(
                                fabric.Config._Static._Proxy.$instance.
                                    get$helloStoreName());
                            if (!fabric.lang.Object._Proxy.idEquals(helloStore,
                                                                    null)) {
                                fabric.util.Map rootMap = helloStore.getRoot();
                                if (!fabric.lang.Object._Proxy.idEquals(rootMap,
                                                                        null)) {
                                    fabric.lang.Object
                                      obj =
                                      rootMap.
                                      get(
                                        fabric.lang.WrappedJavaInlineable.
                                            $wrap(
                                              fabric.Config._Static._Proxy.$instance.
                                                  get$helloServPrincipalMapKey(
                                                    )));
                                    fabric.principals.HelloServEP helloEP =
                                      null;
                                    if (fabric.principals.HelloServEP._Impl.
                                          jif$Instanceof(obj)) {
                                        helloEP =
                                          fabric.principals.HelloServEP._Impl.
                                            jif$cast$fabric_principals_HelloServEP(
                                              obj);
                                    }
                                    else {
                                        helloEP =
                                          (fabric.principals.HelloServEP)
                                            fabric.lang.Object._Proxy.
                                            $getProxy(
                                              (fabric.principals.HelloServEP)
                                                fabric.lang.Object._Proxy.
                                                $getProxy(
                                                  fabric.lang.security.DelegatingPrincipal._Impl.
                                                      $addDefaultDelegates(
                                                        ((fabric.principals.HelloServEP)
                                                           new fabric.
                                                             principals.
                                                             HelloServEP._Impl(
                                                             helloStore).
                                                           $getProxy()).
                                                            fabric$principals$HelloServEP$(
                                                              ))));
                                        rootMap.
                                          put(
                                            fabric.lang.WrappedJavaInlineable.
                                                $wrap(
                                                  fabric.Config._Static._Proxy.$instance.
                                                      get$helloServPrincipalMapKey(
                                                        )),
                                            helloEP);
                                    }
                                    return helloEP;
                                }
                            }
                        }
                        return null;
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
            return null;
        }
        
        public static fabric.principals.HelloServEP getInstance(
          final fabric.worker.Store store) {
            return fabric.principals.HelloServEP._Impl.getInstance();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.fabric$principals$HelloServEP$();
        }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            o.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof fabric.principals.HelloServEP;
        }
        
        public static fabric.principals.HelloServEP
          jif$cast$fabric_principals_HelloServEP(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.HelloServEP._Impl.jif$Instanceof(o))
                return (fabric.principals.HelloServEP)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.bottomConf(),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            this.$getStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal())));
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.fetch().$getStore().getPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (fabric.principals.HelloServEP) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.HelloServEP._Proxy(this);
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
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.HelloServEP._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.HelloServEP._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.HelloServEP._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.HelloServEP._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.HelloServEP._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.HelloServEP._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.HelloServEP._Static $instance;
            
            static {
                fabric.
                  principals.
                  HelloServEP.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.HelloServEP._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.HelloServEP._Static._Impl.class);
                $instance = (fabric.principals.HelloServEP._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.HelloServEP._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return this.jlc$CompilerVersion$fabric;
            }
            
            public java.lang.String jlc$CompilerVersion$fabric;
            
            public long get$jlc$SourceLastModified$fabric() {
                return this.jlc$SourceLastModified$fabric;
            }
            
            public long jlc$SourceLastModified$fabric;
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return this.jlc$ClassType$fabric;
            }
            
            public java.lang.String jlc$ClassType$fabric;
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.jlc$CompilerVersion$fabric);
                out.writeLong(this.jlc$SourceLastModified$fabric);
                $writeInline(out, this.jlc$ClassType$fabric);
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
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new fabric.principals.HelloServEP._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm12 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled15 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff13 = 1;
                        boolean $doBackoff14 = true;
                        $label8: for (boolean $commit9 = false; !$commit9; ) {
                            if ($backoffEnabled15) {
                                if ($doBackoff14) {
                                    if ($backoff13 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff13);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e10) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff13 < 5000) $backoff13 *= 2;
                                }
                                $doBackoff14 = $backoff13 <= 32 ||
                                                 !$doBackoff14;
                            }
                            $commit9 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e10) {
                                $commit9 = false;
                                continue $label8;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e10) {
                                $commit9 = false;
                                fabric.common.TransactionID $currentTid11 =
                                  $tm12.getCurrentTid();
                                if ($e10.tid.isDescendantOf($currentTid11))
                                    continue $label8;
                                if ($currentTid11.parent != null) throw $e10;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e10) {
                                $commit9 = false;
                                if ($tm12.checkForStaleObjects())
                                    continue $label8;
                                throw new fabric.worker.AbortException($e10);
                            }
                            finally {
                                if ($commit9) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e10) {
                                        $commit9 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e10) {
                                        $commit9 = false;
                                        fabric.common.TransactionID
                                          $currentTid11 = $tm12.getCurrentTid();
                                        if ($currentTid11 != null) {
                                            if ($e10.tid.equals(
                                                           $currentTid11) ||
                                                  !$e10.tid.isDescendantOf(
                                                              $currentTid11)) {
                                                throw $e10;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit9) {
                                    {  }
                                    continue $label8;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -67, 85, 35, 15, 114,
    -5, 70, -77, -102, -102, 32, -46, -28, -61, -115, -57, -71, -123, -116, 96,
    -49, -108, -26, 124, -61, 13, 25, -4, 76, 97, -1, -16 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510824106000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "H4sIAAAAAAAAANV7e6zj6HWfZvY56/Xuev1ab7zrm/V4MRM5Q1ISX564qEiJD4kiKUqiJBrOmKJI8f0mRcrZNmnr2q0TO23WTpw2i/7htqm7TYAEQRsUCwRIHMdwkCBp+giKJkbrtClcAw2KPoCmdUnp3rl37szcXW+NPgTwI/U9znfO+c75fUc8n179VuOhJG68YKgry72RlqGe3KDUFcuJapzoa9JVk2Ra1d7S3vIg+/k//rvr5y83LnONxzXVD3xLU91bfpI2nuBsNVcBX0+BmcTe/EjjilYPZNTETBuXP0IUceMoDNxy4wbp8SR30f9cE3j5J3/wqV94oPGk0njS8iepmloaGfipXqRK43FP91Z6nHTXa32tNN7m6/p6oseW6lq7qmPgK42nE2vjq2kW64mkJ4Gb1x2fTrJQj/dznlTW7AcV23GmpUFcsf/Ugf0stVyAs5L0Jtd42LB0d51EjT/XeJBrPGS46qbq+C7uRApgTxGg6vqq+2NWxWZsqJp+MuRBx/LXaeN950fclvjqsOpQDX3E01MzuD3Vg75aVTSePrDkqv4GmKSx5W+qrg8FWTVL2nj2vkSrTo+GquaoG/1W2njmfD/x0FT1urJXSz0kbbzzfLc9pWrNnj23ZmdW61v8D3zm4z7jX25cqnhe65pb8/9oNej5c4Mk3dBj3df0w8DHv4/7vPqu1z51udGoOr/zXOdDn3/4Q3/yZz/4/K/8xqHP99yjj7CydS29pX1x9cTvvJe8jj9Qs/FoGCRWbQp3SL5fVfG45WYRVtb+rtsU68YbJ42/Iv368oe/pH/zcuMxtvGwFriZV1nV27TACy1Xj2nd12M11dds44rur8l9O9t4pHrmLF8/1AqGkegp23jQ3Vc9HOy/VyoyKhK1ih6pni3fCE6eQzU1989F2Gg0HqmuxjPV9XB1acd3KW2owCypjB/o19a+qgwG6OmJkwYhMOr7m1tiHNT6AEjVrXhQ4++vXDi2NCCMgzSotQYYJxWWr1mh6iYAo7tuUHlQ3hdvVK3h/4lJilrSp7aXLlWL8D4tWOsrNalW9Ni6CNGtHIgJ3LUe39Lcz7zGNt7+2hf2Fnal9oqksuy9Di9VVvHe83hyduzLGdH/k5+79bWDddZjj1WcNp47MHnjlMkbZ5is+Hq8drwbFZTdqKDs1UvFDfIV9u/v7evhZO+It0ldqUh9yA0qECwaly7thXrHfvDeqiqbcCqsqeDk8euTjw4+9qkXHqjMOdw+WK1o3fXqeec6hSS2elIrj7mlPfnJP/4vP//5l4JTN0sbV+/y/rtH1t77wnkNxYGmryt0PCX/fUfqL9167aWrl2vkuVKBYqpWZlshzPPn57jDi2+eIGKtioe4xluMIPZUt246gbHHUjMOtqc1+5V/Yv/8tm9Xn0vV9T/rq7H/XPqtukwbB4jpVXJOg0Glyn5ROfmNWqlH10788Ghz4ojXw/BgUbXmz0m7R+YPT8Kf+Re/9e/b+z3rBMSfPIP2Ez29eQY4amJP7iHibacLOY11ver3r35K/InPfeuTH9mvYtXj/fea8GpdkhWjasVgEH/iN6Lf/8M/+OLvXT5d+bTxcJitXEsr7quMxmcOynjfnuRF0ldsvHjKaIVIbuWglRzJ1ZnvBWvLsNSVq9c2+KdPfgD6pf/wmacOhuRWNYdliRsffH0Cp/XvIRo//LUf/K/P78lc0uod8VSZp90OMPv2U8rdOFbLmo/iR373uS98Rf2ZyqEqkEysnb7HvcZeOY39anb2igH2ZftcG1IXLxxU9959/YPJ3VsOVe/dp1auAK/+zWfJP/PNA5LctvKaxvfeA0lk9YwDtr7k/efLLzz85cuNR5TGU/uwQfVTWXWz2iaUauNPyONKrvHWO9rv3MQPO9bN21783vMedmba8/51imDVc927fn7sdVyq0TtYEXDGpag6ynt9n7rUCGuqP7Cn/YF9ea0umnuNX05rJKyDs7Ri0/Ir+Ls/E19+o6acNh7ZBrGjx1f3xN6ZNt5xjNSH6hvz/a1ue/bg83WJ3X/mVw4zX9+LfxIpVnQuFLxyz4fAG+0bYE2Wubf8D9SPH6yLbl0Q3x3pn7Vd7Sp53CZX23DlRlcPGjhRyFN7f6qt6cYhJNw3vCdtPF5vRKGrpjUOF2e0Uxdssd+ZnjgdzAVVNPnpb/z4b372/X9Y+cSg8VBe22vlCmdm4LM63P7Lr37uube8/PVP7wGsQq9bv/bC4qma6qwuuGo7rdmeBFms6ZyapKM9ZujrE87v9k0xtrwKa/PjcFD/1Mt/9ds3PvPyAZcOMfP77wpbz445xM17Kd96H83XFQfNP32i0aPb0Vu1zBVb33sRW/spqH/38y/945996ZOHIPTpO0PGvp95/+Cf/Y/fvPFTX//qPYKMB93gECecW4f07b/HdBK2e/LhIJVUunIh+RmOWytYIpZzQUK2AWfqCcbNCE3WR1mRjExvvaM7k8VO2GVZW2iWmLegvHbOzSOcnC2T8XhTavKg78hhr2QlfOwUYbfXA0h2vStsx2YLU5IHrLX05HTqAGiKoq7jRMokV+PQz/I8B/IEyHMEbTZBfEoGqbMbyyEBT5212Ar6dIp34xY4QRQqgXxZ88os6nYGBY50mnEBjCGjyUQTmZtIuuPNo/kcQpDA6uGho6UpHSqECROujERUNIjSmJDRVW8IuZP1CJKU1cynV4pCT1eS53ZLz57tol2usguEcMBolmRjhQ/Jnhq70WQZU0QkdDYQl0YDT4gcnpsnyRhaJKnCSjE7IeF4MAg33cXSHMbueGh0p92iJI1tZ6HruxRH8pxZDYZ+NLDnw1RGdmF3kLKoPCl1dDrV5rS13LXW68ib92xHoxwmdKABON9V2MzC0Tywg2IWOFNp5cxLddFiIknJNJBedcdcK1p566CldZaO5cjmrKd6EmmGZThHfGmyhG1kU00cOi1P0qYLLotVrJv5rj9EKEDgIkH3MsVZrVB3g4s648jMWhlMrIqXSaxZG8LMO8hkBUlynASqCvGDpt+cw6XfV8I8FFQrGkcUyPcWeuIty9KVYTFxHC/teXGIbLothhbkHt2VivZ4OFPw0YBcKJAD+YI7o0w1hGEkK4N+hAcjpvBdu4NTykbQLKuXSIPdeBi0STpEKB0UR4ElCYyQzB2e7/YmiMVSxsrtyWqvaNHjEQRvI3XVUqZpOkspOJhH3mJFTLfYjG9Z9pIyUy3H10NtKsU9dB3C1GoSKctBtx8moDnICt8huKKjgzAvip3FaLFC0/4cmbmT8aCzc3lFMmCmyzOzPtVnOLk7XbBEuc0DeDVdcx1gvXbKcZ+29T6dj1oiugPzymnCHMVYGtsN1RWfhQgvc8oOyxDd0XBxl3Say8IqZ3MxcANu2MNKjV400Yh2MnrbHXdwUE+mXCqLCNYBmB2P4wMAHjtrteVM0pU8M5kE6ZkKV0TDSdKS5eHIy5xNHI3n+S7mENllebTVGkq+H2YORwT+Mo5kQpkpCyF3qD6hb0hJHotoJ5yDA6g9Rjm0xeQKy0qzLThSO6pHSoUCm2DL2TEBt+u1dozQQont1gPBYWq4SbuacaGiIIyRzZlUVvQ1sqeMUD8YaISPSpBLRV6HGAfdvkqHVKTIsiSvDVLZ6ItUVTeQGKREadtT02kNCNI0vWjnq0vc2cxUaj2BYhmjCTlzIrYvC3JspGop23gT2lDuKh5bccvpTmKPKOh+D0htVXZLvIkKgDZLQcShJsNWKU0KgTFHoQ+Nui4AIYwZjsURGIi+LvW8dXstIxQq5MMggYM0lbmFBIVR3BPcrmeNK6PvmfRuuB2uhqwBduVx2oZbMLxeLNo2j9PUZpdUSkq7AR+C+ljUEwKk0x4LuRg7Wux2/azNKRswY51I39Iup6hqvx9FC6UyP1cHNz2+iF2KkSbdqSdu6U1eQMvVSKW3JTvmBGYwIXbiGBmvWM9hBlO6y1gtooTgdZfB8QLzdNjczFoqa3blcDZhPQmeB4jP8d3mBl3MgEE5wz0+bc8lfhXNU3Nlr0Y9mtqqvjXq8mNQQEleQ7weIslgUlrhXJDZUEOzESDzi42z26FMYkyLIJLUdV/Gow7vmFiWbdOU6a5Jtq1AEqoSSjKfWjGI2ik0N3RhKg8cH56budclY4AZzTbIzhY0LuQnZBfQc26Bm2EirADHSoowGE34zCaVUbIlxgkx6SlDDNF5Ks6BNo+G+sSvlJX0kYVuEeVwle8mJltQ7bJl5duojRablHJ0cUuAw3yDJ3QCxWt9qLudcEgNxUlKg2IRQFhzzLRxsOVFqW5KbDYZiKMmMBZycTgoMdsLS7RTQNP5dMbR5nrJLbjCY7g2o9tgzs+gsC86wQJgSJcAmZDPu9MthXK6bJUZORsRzjiMjGnLKERF96wKahRvtKV7W3ix9cmp2MNdYDMsrITtecoWAxIbtDnaghfrUbGYl3QpWfyOnHakjYz3QglWJiyMygikb7g+xtqW3I/ycDdkQJcHysFuI1Cwmnje0ra9bitlfXU2Y5dI3yIXIkCo4zJVFhu4p81G5YzvZ1S4zFHd1OMF1WlNu9s+YU2m6nK0UgqXB+dzm5kImM8VAVIoU7/NpNtoPIYgcwSHYzNPil2z7yiaE0IaPQpJutXsd1iURVMzGxBrd9uhrCAcwcIkA/IZ04YgxQj0HN+JyyaJmDYmmUJpGJDf46bYSksXYBjCm3nIWuDCLyZ4FbqphoGPLFdTKylCeT2QzWanPcyjIQ6282m1Q2WADMNDC0i0VMYhEOvgTZ0IGMwPtg7P+BzJ9BNlEi4NCJp1vTmLoBufKRyomYFLjGaMptIJaGCyjekyKyUiJ3f6aLRtzSdY0JouuvJc7DP9RZtEgRa6SAQAUXDSGJk+6G5GxGRQdBZ8U5kMkJVPKJrvDvCWS5cwJxgeiWkA7xvlFEOBiGoj7JZfI60CRCMAK1GMz5OWh5pVBKQMNtlWpvk+PnJ9qknPxjTUhH1QbePkFk5yRiqWuL7uIJ3IFgR9pk0xHOrZRd9b5oSZon5lGwnYsaepa2zI1iJsFrPMawM7JED9fBx6LWcsceSA16dIwU35GdaDQZEZCYyTgS1oxQGRo6fqCNppLQPYYd0OzKVxOvGklrZk7YmItSJhjIttcUXDviwwEIRFaasZLZABVbY9FdOBjqJ34YLHQCEquoy4jFsS5Q6Kctua9rrsJMAmYs9UyxXXTxdmDjIktLZZm/JIs5PPAnLhDVmecT0gLNsDSFZBS9B8gbREpj0qJquMG4ipbOnGjnUBe1GOe6JGZIZq8/00D9AVWhZuu0LdVICdZWcQb4i5ishWiqNNXfBB1Giigbd0uNl8nPfgodnaRB4wColZk6VsDg8pvc1NA6GEeAdYG6nQBqhdawhNZtlssJ17fmvpTfM56kMWPClgveBspujbUr6ix+rAy4ttF8ytYEj1E1pbzAx1GMc4HZiovw0oDx8YbA+ck3ykRC6268PWOJkuwGZrpHHMsqOMo540xEW1UxLYcA5S2Eyk5QCfFKpQrcF2l5tay/KGmGx1yeWa9vRVx263ObSNZitEAJZbfuhWGCJxSdkGZ8vRbGfrixK2NovhcrBzm4LTyY0tQmUzc0eQ7Q7puhA65RDMXdC73ULUYpkyqjAh1QhPsRmIp8Y7bJKNc9OWkS5gZCw/m4FG5ArDgB2mu4Dq9Tl2SklLiiBVeuawaNwMWnzZH7s4Bm+cdCDynepXm8Ao9GAl7ciuz29RdLIJ6LZkoGjCSi2znPYjQeUgv8kGnZBVWdwYmzuKQASd72Rjy+Wpdm4autTxvJaA9fxMZcUhEqyq3XK6kptcm0L1mYPScyLowRw81BjY8yYdTOSa1HAnd6brtIN30KHfsyeJkMRdtAqCltuZ1koXDkJRpdxjBdVIzVHPMjspsYs69m6QFgDtemtbs7HEn2ZbRe637SlMxcN+mCs9K8OtmSKqc8ud7GaFkjRLc47RYt/t4uNZCMRbnQpFawEh3REITYVl5k2Krk6Bqk0nQ9JpZ7aNxmrWDuFwarXTZUR0g3wHq7qouMkWbE8ZpmcPS0ddVT9XV2WsCAtiC/tkASJsomxX1DrZoLrc2mh+246UMbcBWsCGAApAYqasBgAZgFhFZxWvDYRfVnAxKlq9FF81k6jZVDGkzaKEREY7HICYsVGBwMqJLUFZ4uTG1Kb5cCJsAo8gqtVEd6jXjoHcn+fjzkIBxIE164Gs0sH7kwicTOY7kyBmIwkPqFg1bGNEeMXOXwlcN3RZ3E76TR3cBbi0szFyJg4VhNs4+lat3BwPI0Yb4dRYw+JuBFLdEGyJDLcbB1mGbJFK8T0m0MFEi8IZIFODJrlFpKGfyZsmCMzbW1pCZuas3YNhB24qY9Rq4+I0whGu70WsYlqsMnRa+nqgbnyx+g058OcDV5r3V7REB70C9TBYjJW0aTbHOElAcmUu3rbbZIQ5iSwJmhnqZaLPTH5DbmXKwadlFc+jAIH2CJLdrgNrJmXwxG+LQjamSKk7BlpbW4WMfouugmw8TMEEbqrIDGmvopBH8j4GdbudMVsOBWvrVZgwXebBdhDoy2jFDJZiZYQVSg+HaItqKpFHbNntClwhQ3LgF1a71wVlRNwMlHwzmDMrxyN2pqGt1gSMwrnZhBBRA7g1QRCeOshHvkgOVwBtxePternrIBvLz20JKOJgyeucX+EdN6z2Q1qQZkOWVGA6WCczgpj3B+YytLom5CyHDDvdpoMKywB5SPZiyejPljPXJTYSyUyX5qY7AkbjzhCFcpVMeZ6dpNRAbNO8JwXzqTgYeTQx2+ponE3HXVKjGF5hIxSGhdJei8ZKbS6hHkNJoGnBqimD6yamylPehIBwMWd2dpBSbKuPzSZRHBElY+iwbIIBRyr2cDKGOUIYYH0EtB0lmXnrdYeZ2pvCWWmVc9lWbFAxHYotfrDsCD2eW7Pq0lupwWLEcqgxLRMH4se9VVsgR7qehFhrDCVocyTzk6yDaIP1mnUNTTCcHIZLLUnFHtZB2BHCL3rMJAkhT8YBQU51N6ONBeKPcn2OmW1EkcsoBDFt1kG69nJsCFvboLthc+T3eG8FQoYcpT5A+26Oaruupyf9RblZe4N2ztADpM1hBiAaubDwfcfTACElUFDhN6MVucwkdYqqfCliILMDpn12Lmw3bbhsrRUm7ZRw11qp03kgR1hSxdiKHq6N4S5yGYzfSCvU1oRWoEPSRhP7FeZna3oaJL3OdiFYub6w+RYatZSsQwXwaFGqVNnbddJevzDbcSuq3F6j+XFLJIYJhTutyjVKvoP1ebrPKLwT2Y5g+P1BIttZ2ZFdZDgnlwBqbye+TI+TkU8mIieABIYbCp9Bmt8HmrgjlGJhbxb5iLaj8Ypw+gnI9DQHc6B2E9PTIWPiRgJXhqsPwXX101YNjVLk3R63U7v4UFAQVl8OJWzHFuTAGw51W1M12zUH3oDuJloT1QzRz1co0BTpTqJ1OLofLUBUmCN1LQSgiANzuUqMyYIlfL2yufGalCtEAnQEK7CuvTP09Vxs9z0gHZERCtkRusFDPJMXPkVjWMTIGDQkclTcsFM745LEThNAF6W1sQygDGUKVFEZMNJLMWRLoZAtA9suvajoQU2QakO9PPcBQoCwyQzsJLA2WlNLzDZNQSxaOwknVoppwNTajQPcFPJ5qgwlr9pHULyjiCW122J2Kc2daTp3gW40aEut6TxORJRzRRng3S3AaNOpLHQpu9mDina3yfYHm+7+NbB2/EL0Hfv3uLeT/If3oHXbeP8+8PCy+AN1cf3w9vL4VfE+01tf4+P7sG59+/5F/DvO5Dsa9dvL5+6XmN+/ufziX3j5lbXwt6HLx0mTj6WNK2kQfr+r57p7htSV+j3oXQc/RvvjCKcZkK9/8zmcdP5oc3gP+r5zM5/v/fdGr36VflH765cbD9xOddx1BuLOQTfvTHA8FutpFvvTO9IcR7d1daXWwbuq69Hq+sLx/UfP6OrM++9zar7cOO5eX58+vn/ivJrvnXjKLmjb1kWYNp4/LPbV09Ty1TOp5aunfHm3WXqqJtKsrser618f379yH2nuSsScJiKKO4V88pjSrx/ff/mNCfnnL2j7kboo08ZbNnp6snIXSvRio/Fg+/j+zHdFoprSu4/vj91fokvHKfbjrMnb70wjTdIg1u+dONlz9lcu0MFn6+Ivvr4O";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "9qc4XqyZOPbtS4dsxGe/s+z2hzoY+KGjKFMTK8qCVL92SBwf5YG1PrIt42oVeASO3tONMycArl0/+nhqWsmNi43x2vWbL52mzy/CpDtkqFt/Igwv0NFPXtD2hbr4a2njmfsxvx+l1MVHD+t/K208WIt7TsG14+4fzin4Y99hrvNDLRC7U8OxlVctZ1VspbVKjz7y0cnReY2dN99LaeORYwrFnYp85F6K/FsXKvLvXND2s3XxStp49ITF+vvfOKekJ+ruz92lpMuf/E6VBCHwHUo6JH+Pjq1xFQSurvp7bZ04RWBc+8g+M3x0sMKPq97qpX1e8fB0SIbvn4+Cj1KVfi3j6Fpw9OEPH/mZ614/OuwB1Wg30W8eO/A+LZnoWhZbaXmDU1e6O6tzcaqm6UlCmrrmXLv3dCeDDt9ujzx8TYN9xbVDfvlQV/n34eu16/UzV5/x2QPHtesfvI9IF84R6+paj8Wg0lf5xicKDn0MPdXMqv1q1eG4re4rnjj2G+Xp9oCzsodnyLw52SoarJ/qm/34A8vXbx6vX7Wk1m2TODqDP3ejz+tvBf9bCfaL94inz5rYwTgv2CJ+4QLP/Ed18aW08cSd7nAvYHvk2HPOuu1J5vqZU7e9tDjI+GaPRv3f02799Rf3XHz5Ao3to53X0saLtcY0NUmPY+ZbpzvXrTOWc9/99um7kO6B/DveDmDkXhvuwSKO9ki7t/5kvyXst9mrWbiuBu+rjz785hzoAEAHcqdO/qa8cRWkaeBVW6rxJglsq5bbUPXmWHpdoPlu4dX1m8drcNgCDkz/P7AId8D93RQP4dn/N6h+Q6us6ViYSuN7LxDVON2fmEzqqmO0r+W6eVeQ9EbDyq9dGA399gVtv1MXX63C8jMOuseee8HEU3dHjX/pO4YJDL1vXH6XeurYUc+rldifuL9xV/v1m/eILN+o0v7phUr7/Qva/mVd/JO08eQ5hvaRZFEp8wzm1oc5v+cex7WP/2igkb+mf/GPhh98532Oaj9z118/jsf93CtPPvruV2b/fH/8+PafCK5wjUeNKgo8e+jxzPPDYawb1l6GK4cjkAfNfT1tvO2us91p47HTL3vZ/uDQ+9+kjYdP3818Y/9Dcn+u8NmTmODFe4adlWnocRXY3nawC+KEZ7O4/vPLq//p3f/t4UenXz8+Q9c4em32/ifj/0794k//9NHvfuNXf+wrv/yJH/3Yb7/8b3/oV9/6nj/l1G//x/8FM1plZpQzAAA=";
}
