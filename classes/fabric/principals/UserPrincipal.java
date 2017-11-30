package fabric.principals;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.worker.Store;
import fabric.util.*;
import calendar.Config;
import calendar.User;
import login.LoginClosure;

public interface UserPrincipal extends fabric.lang.security.ExternalPrincipal {
    public fabric.principals.UserPrincipal fabric$principals$UserPrincipal$(
      final java.lang.String userName, final java.lang.String password);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512080460000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface fabric$principals$UserPrincipal$_split_0
      extends fabric.lang.Object {
        public fabric.principals.UserPassword get$pass();
        
        public fabric.principals.UserPassword set$pass(
          fabric.principals.UserPassword val);
        
        public fabric.lang.Object $initLabels();
        
        public fabric.principals.UserPrincipal get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements fabric$principals$UserPrincipal$_split_0 {
            public fabric.principals.UserPassword get$pass() {
                return ((fabric.principals.UserPrincipal.
                          fabric$principals$UserPrincipal$_split_0._Impl)
                          fetch()).get$pass();
            }
            
            public fabric.principals.UserPassword set$pass(
              fabric.principals.UserPassword val) {
                return ((fabric.principals.UserPrincipal.
                          fabric$principals$UserPrincipal$_split_0._Impl)
                          fetch()).set$pass(val);
            }
            
            public fabric.principals.UserPrincipal get$$root() {
                return ((fabric.principals.UserPrincipal.
                          fabric$principals$UserPrincipal$_split_0._Impl)
                          fetch()).get$$root();
            }
            
            public _Proxy(fabric$principals$UserPrincipal$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements fabric$principals$UserPrincipal$_split_0 {
            public fabric.principals.UserPassword get$pass() {
                return this.pass;
            }
            
            public fabric.principals.UserPassword set$pass(
              fabric.principals.UserPassword val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.pass = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            private fabric.principals.UserPassword pass;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    fabric.lang.security.LabelUtil._Impl.
                        writerPolicyLabel(
                          this.$getStore(),
                          fabric.worker.Worker.getWorker().getPrincipal(),
                          fabric.worker.Worker.getWorker().getPrincipal()));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (fabric$principals$UserPrincipal$_split_0)
                         this.$getProxy();
            }
            
            public fabric.principals.UserPrincipal get$$root() {
                return this.$root;
            }
            
            private fabric.principals.UserPrincipal $root;
            
            public _Impl(fabric.worker.Store $location,
                         fabric.principals.UserPrincipal root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new fabric.principals.UserPrincipal.
                         fabric$principals$UserPrincipal$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.pass, refTypes, out, intraStoreRefs,
                          interStoreRefs);
                $writeRef($getStore(), this.$root, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.pass =
                  (fabric.principals.UserPassword)
                    $readRef(fabric.principals.UserPassword._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.$root =
                  (fabric.principals.UserPrincipal)
                    $readRef(fabric.principals.UserPrincipal._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                fabric.
                  principals.
                  UserPrincipal.
                  fabric$principals$UserPrincipal$_split_0.
                  _Impl
                  src =
                  (fabric.principals.UserPrincipal.
                    fabric$principals$UserPrincipal$_split_0._Impl) other;
                this.pass = src.pass;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements fabric.principals.UserPrincipal.
                           fabric$principals$UserPrincipal$_split_0._Static
            {
                public _Proxy(fabric.principals.UserPrincipal.
                                fabric$principals$UserPrincipal$_split_0.
                                _Static._Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final fabric.principals.UserPrincipal.
                  fabric$principals$UserPrincipal$_split_0._Static $instance;
                
                static {
                    fabric.
                      principals.
                      UserPrincipal.
                      fabric$principals$UserPrincipal$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (fabric.
                        principals.
                        UserPrincipal.
                        fabric$principals$UserPrincipal$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          fabric.principals.UserPrincipal.
                            fabric$principals$UserPrincipal$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (fabric.principals.UserPrincipal.
                        fabric$principals$UserPrincipal$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements fabric.principals.UserPrincipal.
                           fabric$principals$UserPrincipal$_split_0._Static
            {
                public void $serialize(java.io.ObjectOutput out,
                                       java.util.List refTypes,
                                       java.util.List intraStoreRefs,
                                       java.util.List interStoreRefs)
                      throws java.io.IOException {
                    super.$serialize(out, refTypes, intraStoreRefs,
                                     interStoreRefs);
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
                    return new fabric.principals.UserPrincipal.
                             fabric$principals$UserPrincipal$_split_0._Static.
                             _Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 64, -77, 0, 76, 56,
        -117, 51, -28, 55, 10, -125, -52, 48, -121, -38, -43, 64, 64, 91, 113,
        20, -17, -10, -52, -48, 110, 48, -120, 89, 98, 120, 6 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512080460000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
      get$fabric$principals$UserPrincipal$_split_0();
    
    public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
      set$fabric$principals$UserPrincipal$_split_0(
      fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0 val);
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.security.ExternalPrincipal._Proxy
      implements fabric.principals.UserPrincipal {
        public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
          get$fabric$principals$UserPrincipal$_split_0() {
            return ((fabric.principals.UserPrincipal._Impl) fetch()).
              get$fabric$principals$UserPrincipal$_split_0();
        }
        
        public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
          set$fabric$principals$UserPrincipal$_split_0(
          fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0 val) {
            return ((fabric.principals.UserPrincipal._Impl) fetch()).
              set$fabric$principals$UserPrincipal$_split_0(val);
        }
        
        public fabric.principals.UserPrincipal fabric$principals$UserPrincipal$(
          java.lang.String arg1, java.lang.String arg2) {
            return ((fabric.principals.UserPrincipal) fetch()).
              fabric$principals$UserPrincipal$(arg1, arg2);
        }
        
        public static fabric.principals.UserPrincipal getInstance(
          java.lang.String arg1, java.lang.String arg2) {
            return fabric.principals.UserPrincipal._Impl.getInstance(arg1,
                                                                     arg2);
        }
        
        public static fabric.principals.UserPrincipal
          jif$cast$fabric_principals_UserPrincipal(fabric.lang.Object arg1) {
            return fabric.principals.UserPrincipal._Impl.
              jif$cast$fabric_principals_UserPrincipal(arg1);
        }
        
        public _Proxy(UserPrincipal._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl
    extends fabric.lang.security.ExternalPrincipal._Impl
      implements fabric.principals.UserPrincipal {
        public fabric.principals.UserPrincipal fabric$principals$UserPrincipal$(
          final java.lang.String userName, final java.lang.String password) {
            ((fabric.principals.UserPrincipal._Impl) this.fetch()).jif$init();
            {
                {
                    this.
                      get$fabric$principals$UserPrincipal$_split_0().
                      set$pass(
                        (fabric.principals.UserPassword)
                          fabric.lang.Object._Proxy.
                          $getProxy(
                            ((fabric.principals.UserPassword)
                               new fabric.principals.UserPassword._Impl(
                                 this.$getStore(),
                                 (fabric.principals.UserPrincipal)
                                   this.$getProxy()).$getProxy()).
                                fabric$principals$UserPassword$(password)));
                }
                this.fabric$lang$security$ExternalPrincipal$(userName);
            }
            return (fabric.principals.UserPrincipal) this.$getProxy();
        }
        
        public static fabric.principals.UserPrincipal getInstance(
          final java.lang.String userName, final java.lang.String password) {
            {
                fabric.worker.transaction.TransactionManager $tm12 =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean $backoffEnabled15 =
                  fabric.worker.Worker.getWorker().config.txRetryBackoff;
                int $backoff13 = 1;
                boolean $doBackoff14 = true;
                $label8: for (boolean $commit9 = false; !$commit9; ) {
                    if ($backoffEnabled15) {
                        if ($doBackoff14) {
                            if ($backoff13 > 32) {
                                while (true) {
                                    try {
                                        java.lang.Thread.sleep($backoff13);
                                        break;
                                    }
                                    catch (java.lang.
                                             InterruptedException $e10) {
                                        
                                    }
                                }
                            }
                            if ($backoff13 < 5000) $backoff13 *= 2;
                        }
                        $doBackoff14 = $backoff13 <= 32 || !$doBackoff14;
                    }
                    $commit9 = true;
                    fabric.worker.transaction.TransactionManager.getInstance().
                      startTransaction();
                    try {
                        fabric.worker.Worker w =
                          fabric.worker.Worker.getWorker();
                        if (!fabric.lang.Object._Proxy.idEquals(w, null)) {
                            final fabric.worker.Store
                              store =
                              w.
                              getStore(
                                calendar.Config._Static._Proxy.$instance.
                                    get$calendarStoreName());
                            if (!fabric.lang.Object._Proxy.idEquals(store,
                                                                    null)) {
                                fabric.util.Map rootMap = store.getRoot();
                                if (!fabric.lang.Object._Proxy.idEquals(rootMap,
                                                                        null)) {
                                    fabric.lang.Object
                                      obj =
                                      rootMap.
                                      get(
                                        fabric.lang.WrappedJavaInlineable.
                                            $wrap(userName));
                                    fabric.principals.UserPrincipal userP =
                                      null;
                                    if (fabric.principals.UserPrincipal._Impl.
                                          jif$Instanceof(obj)) {
                                        userP =
                                          fabric.principals.UserPrincipal._Impl.
                                            jif$cast$fabric_principals_UserPrincipal(
                                              obj);
                                    }
                                    else {
                                        userP =
                                          (fabric.principals.UserPrincipal)
                                            fabric.lang.Object._Proxy.
                                            $getProxy(
                                              (fabric.principals.UserPrincipal)
                                                fabric.lang.Object._Proxy.
                                                $getProxy(
                                                  fabric.lang.security.DelegatingPrincipal._Impl.
                                                      $addDefaultDelegates(
                                                        ((fabric.principals.UserPrincipal)
                                                           new fabric.
                                                             principals.
                                                             UserPrincipal.
                                                             _Impl(store).
                                                           $getProxy()).
                                                            fabric$principals$UserPrincipal$(
                                                              userName,
                                                              password))));
                                        rootMap.
                                          put(
                                            fabric.lang.WrappedJavaInlineable.
                                                $wrap(userName),
                                            userP);
                                    }
                                    return userP;
                                }
                            }
                        }
                        return null;
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
                        if ($tm12.checkForStaleObjects()) continue $label8;
                        throw new fabric.worker.AbortException($e10);
                    }
                    finally {
                        if ($commit9) {
                            try {
                                fabric.worker.transaction.TransactionManager.
                                  getInstance().commitTransaction();
                            }
                            catch (final fabric.worker.AbortException $e10) {
                                $commit9 = false;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e10) {
                                $commit9 = false;
                                fabric.common.TransactionID $currentTid11 =
                                  $tm12.getCurrentTid();
                                if ($currentTid11 != null) {
                                    if ($e10.tid.equals($currentTid11) ||
                                          !$e10.tid.isDescendantOf(
                                                      $currentTid11)) {
                                        throw $e10;
                                    }
                                }
                            }
                        }
                        else {
                            fabric.worker.transaction.TransactionManager.
                              getInstance().abortTransaction();
                        }
                        if (!$commit9) {
                            {  }
                            continue $label8;
                        }
                    }
                }
            }
            return null;
        }
        
        public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
          get$fabric$principals$UserPrincipal$_split_0() {
            return this.fabric$principals$UserPrincipal$_split_0;
        }
        
        public fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0
          set$fabric$principals$UserPrincipal$_split_0(
          fabric.principals.UserPrincipal.fabric$principals$UserPrincipal$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.fabric$principals$UserPrincipal$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public fabric$principals$UserPrincipal$_split_0
          fabric$principals$UserPrincipal$_split_0;
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        private void jif$init() {
            this.
              set$fabric$principals$UserPrincipal$_split_0(
                (fabric$principals$UserPrincipal$_split_0)
                  new fabric.principals.UserPrincipal.
                    fabric$principals$UserPrincipal$_split_0._Impl(
                    this.$getStore(),
                    (fabric.principals.UserPrincipal) this.$getProxy()).
                  $getProxy());
        }
        
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
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof fabric.principals.UserPrincipal;
        }
        
        public static fabric.principals.UserPrincipal
          jif$cast$fabric_principals_UserPrincipal(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.UserPrincipal._Impl.jif$Instanceof(o))
                return (fabric.principals.UserPrincipal)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    writerPolicyLabel(
                      this.$getStore(),
                      fabric.worker.Worker.getWorker().getPrincipal(),
                      fabric.worker.Worker.getWorker().getPrincipal()));
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (fabric.principals.UserPrincipal) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$fabric$principals$UserPrincipal$_split_0().
              fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.UserPrincipal._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(),
                      this.fabric$principals$UserPrincipal$_split_0, refTypes,
                      out, intraStoreRefs, interStoreRefs);
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
            this.fabric$principals$UserPrincipal$_split_0 =
              (fabric.
                principals.
                UserPrincipal.
                fabric$principals$UserPrincipal$_split_0)
                $readRef(
                  fabric.principals.UserPrincipal.
                    fabric$principals$UserPrincipal$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            fabric.principals.UserPrincipal._Impl src =
              (fabric.principals.UserPrincipal._Impl) other;
            this.fabric$principals$UserPrincipal$_split_0 =
              src.fabric$principals$UserPrincipal$_split_0;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.UserPrincipal._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.UserPrincipal._Static._Impl)
                          fetch()).get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.UserPrincipal._Static._Impl)
                          fetch()).get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.UserPrincipal._Static._Impl)
                          fetch()).get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.UserPrincipal._Static._Impl)
                          fetch()).get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.UserPrincipal._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.UserPrincipal._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  UserPrincipal.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.UserPrincipal._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.UserPrincipal._Static._Impl.class);
                $instance = (fabric.principals.UserPrincipal._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.UserPrincipal._Static {
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
                return new fabric.principals.UserPrincipal._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm20 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled23 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff21 = 1;
                        boolean $doBackoff22 = true;
                        $label16: for (boolean $commit17 = false; !$commit17;
                                       ) {
                            if ($backoffEnabled23) {
                                if ($doBackoff22) {
                                    if ($backoff21 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff21);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e18) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff21 < 5000) $backoff21 *= 2;
                                }
                                $doBackoff22 = $backoff21 <= 32 ||
                                                 !$doBackoff22;
                            }
                            $commit17 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e18) {
                                $commit17 = false;
                                continue $label16;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e18) {
                                $commit17 = false;
                                fabric.common.TransactionID $currentTid19 =
                                  $tm20.getCurrentTid();
                                if ($e18.tid.isDescendantOf($currentTid19))
                                    continue $label16;
                                if ($currentTid19.parent != null) throw $e18;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e18) {
                                $commit17 = false;
                                if ($tm20.checkForStaleObjects())
                                    continue $label16;
                                throw new fabric.worker.AbortException($e18);
                            }
                            finally {
                                if ($commit17) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e18) {
                                        $commit17 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e18) {
                                        $commit17 = false;
                                        fabric.common.TransactionID
                                          $currentTid19 = $tm20.getCurrentTid();
                                        if ($currentTid19 != null) {
                                            if ($e18.tid.equals(
                                                           $currentTid19) ||
                                                  !$e18.tid.isDescendantOf(
                                                              $currentTid19)) {
                                                throw $e18;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit17) {
                                    {  }
                                    continue $label16;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 51, 55, 12, -42, 115,
    -29, 118, -98, 23, 98, 101, -85, 36, -92, -94, -11, 30, -87, -86, -126, -97,
    -28, 29, -126, -99, 121, 52, -82, -13, 29, -121, 91 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512080460000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}

interface UserPassword extends fabric.lang.Object {
    public fabric.principals.UserPassword fabric$principals$UserPassword$(
      final java.lang.String password);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1512080460000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface fabric$principals$UserPassword$_split_0
      extends fabric.lang.Object {
        public java.lang.String get$password();
        
        public java.lang.String set$password(java.lang.String val);
        
        public fabric.lang.Object $initLabels();
        
        public fabric.principals.UserPassword get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements fabric$principals$UserPassword$_split_0 {
            public java.lang.String get$password() {
                return ((fabric.principals.UserPassword.
                          fabric$principals$UserPassword$_split_0._Impl)
                          fetch()).get$password();
            }
            
            public java.lang.String set$password(java.lang.String val) {
                return ((fabric.principals.UserPassword.
                          fabric$principals$UserPassword$_split_0._Impl)
                          fetch()).set$password(val);
            }
            
            public fabric.principals.UserPassword get$$root() {
                return ((fabric.principals.UserPassword.
                          fabric$principals$UserPassword$_split_0._Impl)
                          fetch()).get$$root();
            }
            
            public _Proxy(fabric$principals$UserPassword$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements fabric$principals$UserPassword$_split_0 {
            public java.lang.String get$password() { return this.password; }
            
            public java.lang.String set$password(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.password = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String password;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          this.$getStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                this.$getStore(),
                                this.get$$root().
                                    get$jif$fabric_principals_UserPassword_P(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                this.$getStore(),
                                this.get$$root().
                                    get$jif$fabric_principals_UserPassword_P(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal())));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (fabric$principals$UserPassword$_split_0)
                         this.$getProxy();
            }
            
            public fabric.principals.UserPassword get$$root() {
                return this.$root;
            }
            
            private fabric.principals.UserPassword $root;
            
            public _Impl(fabric.worker.Store $location,
                         fabric.principals.UserPassword root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new fabric.principals.UserPassword.
                         fabric$principals$UserPassword$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.password);
                $writeRef($getStore(), this.$root, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.password = (java.lang.String) in.readObject();
                this.$root =
                  (fabric.principals.UserPassword)
                    $readRef(fabric.principals.UserPassword._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                fabric.
                  principals.
                  UserPassword.
                  fabric$principals$UserPassword$_split_0.
                  _Impl
                  src =
                  (fabric.principals.UserPassword.
                    fabric$principals$UserPassword$_split_0._Impl) other;
                this.password = src.password;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements fabric.principals.UserPassword.
                           fabric$principals$UserPassword$_split_0._Static
            {
                public _Proxy(fabric.principals.UserPassword.
                                fabric$principals$UserPassword$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final fabric.principals.UserPassword.
                  fabric$principals$UserPassword$_split_0._Static $instance;
                
                static {
                    fabric.
                      principals.
                      UserPassword.
                      fabric$principals$UserPassword$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (fabric.
                        principals.
                        UserPassword.
                        fabric$principals$UserPassword$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          fabric.principals.UserPassword.
                            fabric$principals$UserPassword$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (fabric.principals.UserPassword.
                        fabric$principals$UserPassword$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements fabric.principals.UserPassword.
                           fabric$principals$UserPassword$_split_0._Static
            {
                public void $serialize(java.io.ObjectOutput out,
                                       java.util.List refTypes,
                                       java.util.List intraStoreRefs,
                                       java.util.List interStoreRefs)
                      throws java.io.IOException {
                    super.$serialize(out, refTypes, intraStoreRefs,
                                     interStoreRefs);
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
                    return new fabric.principals.UserPassword.
                             fabric$principals$UserPassword$_split_0._Static.
                             _Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 64, -77, 0, 76, 56,
        -117, 51, -28, 55, 10, -125, -52, 48, -121, -38, -43, 64, 64, 91, 113,
        20, -17, -10, -52, -48, 110, 48, -120, 89, 98, 120, 6 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1512080460000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
      get$fabric$principals$UserPassword$_split_0();
    
    public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
      set$fabric$principals$UserPassword$_split_0(
      fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0 val);
    
    public fabric.lang.security.Principal
      get$jif$fabric_principals_UserPassword_P();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy
    extends fabric.lang.Object._Proxy implements fabric.principals.UserPassword {
        public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
          get$fabric$principals$UserPassword$_split_0() {
            return ((fabric.principals.UserPassword._Impl) fetch()).
              get$fabric$principals$UserPassword$_split_0();
        }
        
        public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
          set$fabric$principals$UserPassword$_split_0(
          fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0 val) {
            return ((fabric.principals.UserPassword._Impl) fetch()).
              set$fabric$principals$UserPassword$_split_0(val);
        }
        
        public fabric.lang.security.Principal
          get$jif$fabric_principals_UserPassword_P() {
            return ((fabric.principals.UserPassword._Impl) fetch()).
              get$jif$fabric_principals_UserPassword_P();
        }
        
        public fabric.principals.UserPassword fabric$principals$UserPassword$(
          java.lang.String arg1) {
            return ((fabric.principals.UserPassword) fetch()).
              fabric$principals$UserPassword$(arg1);
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return fabric.principals.UserPassword._Impl.jif$Instanceof(arg1,
                                                                       arg2);
        }
        
        public static fabric.principals.UserPassword
          jif$cast$fabric_principals_UserPassword(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return fabric.principals.UserPassword._Impl.
              jif$cast$fabric_principals_UserPassword(arg1, arg2);
        }
        
        public _Proxy(UserPassword._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements fabric.principals.UserPassword {
        public fabric.principals.UserPassword fabric$principals$UserPassword$(
          final java.lang.String password) {
            ((fabric.principals.UserPassword._Impl) this.fetch()).jif$init();
            {
                {
                    this.get$fabric$principals$UserPassword$_split_0().
                      set$password(password);
                }
                this.fabric$lang$Object$();
            }
            return (fabric.principals.UserPassword) this.$getProxy();
        }
        
        public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
          get$fabric$principals$UserPassword$_split_0() {
            return this.fabric$principals$UserPassword$_split_0;
        }
        
        public fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0
          set$fabric$principals$UserPassword$_split_0(
          fabric.principals.UserPassword.fabric$principals$UserPassword$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.fabric$principals$UserPassword$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public fabric$principals$UserPassword$_split_0
          fabric$principals$UserPassword$_split_0;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Principal jif$P) {
            super($location);
            this.jif$fabric_principals_UserPassword_P = jif$P;
        }
        
        private void jif$init() {
            this.
              set$fabric$principals$UserPassword$_split_0(
                (fabric$principals$UserPassword$_split_0)
                  new fabric.principals.UserPassword.
                    fabric$principals$UserPassword$_split_0._Impl(
                    this.$getStore(),
                    (fabric.principals.UserPassword) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Principal jif$P,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            jif$P,
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof fabric.principals.UserPassword) {
                fabric.principals.UserPassword c =
                  (fabric.principals.UserPassword)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.PrincipalUtil._Impl.
                  equivalentTo(c.get$jif$fabric_principals_UserPassword_P(),
                               jif$P);
            }
            return false;
        }
        
        public static fabric.principals.UserPassword
          jif$cast$fabric_principals_UserPassword(
          final fabric.lang.security.Principal jif$P,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (fabric.principals.UserPassword._Impl.jif$Instanceof(jif$P, o))
                return (fabric.principals.UserPassword)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal
          get$jif$fabric_principals_UserPassword_P() {
            return this.jif$fabric_principals_UserPassword_P;
        }
        
        private fabric.lang.security.Principal
          jif$fabric_principals_UserPassword_P;
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            this.get$jif$fabric_principals_UserPassword_P(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            this.$getStore(),
                            this.get$jif$fabric_principals_UserPassword_P(),
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
                            this.get$jif$fabric_principals_UserPassword_P(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (fabric.principals.UserPassword) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$fabric$principals$UserPassword$_split_0().
              fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new fabric.principals.UserPassword._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.fabric$principals$UserPassword$_split_0,
                      refTypes, out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$fabric_principals_UserPassword_P,
                      refTypes, out, intraStoreRefs, interStoreRefs);
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
            this.fabric$principals$UserPassword$_split_0 =
              (fabric.
                principals.
                UserPassword.
                fabric$principals$UserPassword$_split_0)
                $readRef(
                  fabric.principals.UserPassword.
                    fabric$principals$UserPassword$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
            this.jif$fabric_principals_UserPassword_P =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            fabric.principals.UserPassword._Impl src =
              (fabric.principals.UserPassword._Impl) other;
            this.fabric$principals$UserPassword$_split_0 =
              src.fabric$principals$UserPassword$_split_0;
            this.jif$fabric_principals_UserPassword_P =
              src.jif$fabric_principals_UserPassword_P;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements fabric.principals.UserPassword._Static {
            public fabric.worker.Worker get$worker$() {
                return ((fabric.principals.UserPassword._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((fabric.principals.UserPassword._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((fabric.principals.UserPassword._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((fabric.principals.UserPassword._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(fabric.principals.UserPassword._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final fabric.principals.UserPassword._Static
              $instance;
            
            static {
                fabric.
                  principals.
                  UserPassword.
                  _Static.
                  _Impl
                  impl =
                  (fabric.principals.UserPassword._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      fabric.principals.UserPassword._Static._Impl.class);
                $instance = (fabric.principals.UserPassword._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements fabric.principals.UserPassword._Static {
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
                return new fabric.principals.UserPassword._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm28 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled31 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff29 = 1;
                        boolean $doBackoff30 = true;
                        $label24: for (boolean $commit25 = false; !$commit25;
                                       ) {
                            if ($backoffEnabled31) {
                                if ($doBackoff30) {
                                    if ($backoff29 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff29);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e26) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff29 < 5000) $backoff29 *= 2;
                                }
                                $doBackoff30 = $backoff29 <= 32 ||
                                                 !$doBackoff30;
                            }
                            $commit25 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e26) {
                                $commit25 = false;
                                continue $label24;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e26) {
                                $commit25 = false;
                                fabric.common.TransactionID $currentTid27 =
                                  $tm28.getCurrentTid();
                                if ($e26.tid.isDescendantOf($currentTid27))
                                    continue $label24;
                                if ($currentTid27.parent != null) throw $e26;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e26) {
                                $commit25 = false;
                                if ($tm28.checkForStaleObjects())
                                    continue $label24;
                                throw new fabric.worker.AbortException($e26);
                            }
                            finally {
                                if ($commit25) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e26) {
                                        $commit25 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e26) {
                                        $commit25 = false;
                                        fabric.common.TransactionID
                                          $currentTid27 = $tm28.getCurrentTid();
                                        if ($currentTid27 != null) {
                                            if ($e26.tid.equals(
                                                           $currentTid27) ||
                                                  !$e26.tid.isDescendantOf(
                                                              $currentTid27)) {
                                                throw $e26;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit25) {
                                    {  }
                                    continue $label24;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 64, -77, 0, 76, 56,
    -117, 51, -28, 55, 10, -125, -52, 48, -121, -38, -43, 64, 64, 91, 113, 20,
    -17, -10, -52, -48, 110, 48, -120, 89, 98, 120, 6 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1512080460000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "BUXtzR/cwIvk50qqv/SAwbxZJF8Fq7diMIoUxd/HZPebOq8dXxq7F06vvPKegtMjHN2b/qCcL8oIisrpMzbM6PBm4qtAyrIYhML/AUrt2QGo+IHB0UWOZclDBdn/S1jagpr30iBu3zmy9X4+2gv2/439A5+DDhXP1Y+GA3RexhsrhXF5Oy0qio4gvxjZnQvrySL5+L2rx6v3Wz3+0gNXj289oO7rRfILceV9Z6CgxMz7odtTF18Mnn8volv5XnBB1yevB+Wl68ML9bfvvHzwv/z6cHhEXLjGzT2q3rx1/5eDhzXmrz/QmH/9AXV/s0j+aly5cW5sRfHPZmCKPzuO4j7gj97nFvDRvXUF+zvam98Zv/yBd7kB/KEL/yQ4avf1r9147Ie/Jvzz8lLryZ3061TlMR2sls9efTuTv+qHmm6Wg7i+vwi3V93bceXpCzskceXx04dycL+5p/5GXLl6urH1t8u36udOkv0y4LkkLP4L8dZ/+uH/evWx2TtHd8MqB5/6axWq/Xnkd1qP/+lvVV//V//0U596NXj2P/7+t/6hW/3cSs6u/k/xy9WgozEAAA==";
}
