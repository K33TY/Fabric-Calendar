package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.principals.ServletPrincipal;

public interface User extends fabric.lang.Object {
    public calendar.User calendar$User$(final java.lang.String n,
                                        final java.lang.String pw,
                                        final java.lang.String f,
                                        final java.lang.String l);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511992872000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$User$_split_0 extends fabric.lang.Object {
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public java.lang.String get$password();
        
        public java.lang.String set$password(java.lang.String val);
        
        public java.lang.String get$firstName();
        
        public java.lang.String set$firstName(java.lang.String val);
        
        public java.lang.String get$lastName();
        
        public java.lang.String set$lastName(java.lang.String val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.User get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$User$_split_0 {
            public java.lang.String get$name() {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  set$name(val);
            }
            
            public java.lang.String get$password() {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  get$password();
            }
            
            public java.lang.String set$password(java.lang.String val) {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  set$password(val);
            }
            
            public java.lang.String get$firstName() {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  get$firstName();
            }
            
            public java.lang.String set$firstName(java.lang.String val) {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  set$firstName(val);
            }
            
            public java.lang.String get$lastName() {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  get$lastName();
            }
            
            public java.lang.String set$lastName(java.lang.String val) {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  set$lastName(val);
            }
            
            public calendar.User get$$root() {
                return ((calendar.User.calendar$User$_split_0._Impl) fetch()).
                  get$$root();
            }
            
            public _Proxy(calendar$User$_split_0._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$User$_split_0 {
            public java.lang.String get$name() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.name;
            }
            
            public java.lang.String set$name(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.name = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String name;
            
            public java.lang.String get$password() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.password;
            }
            
            public java.lang.String set$password(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.password = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String password;
            
            public java.lang.String get$firstName() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.firstName;
            }
            
            public java.lang.String set$firstName(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.firstName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String firstName;
            
            public java.lang.String get$lastName() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.lastName;
            }
            
            public java.lang.String set$lastName(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.lastName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String lastName;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    fabric.lang.security.LabelUtil._Impl.
                        toLabel(
                          this.$getStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              readerPolicy(
                                this.$getStore(),
                                fabric.principals.ServletPrincipal._Impl.
                                    getInstance(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal()),
                          fabric.lang.security.LabelUtil._Impl.
                              writerPolicy(
                                this.$getStore(),
                                fabric.principals.ServletPrincipal._Impl.
                                    getInstance(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal())));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$User$_split_0) this.$getProxy();
            }
            
            public calendar.User get$$root() { return this.$root; }
            
            private calendar.User $root;
            
            public _Impl(fabric.worker.Store $location, calendar.User root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.User.calendar$User$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.name);
                $writeInline(out, this.password);
                $writeInline(out, this.firstName);
                $writeInline(out, this.lastName);
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
                this.name = (java.lang.String) in.readObject();
                this.password = (java.lang.String) in.readObject();
                this.firstName = (java.lang.String) in.readObject();
                this.lastName = (java.lang.String) in.readObject();
                this.$root = (calendar.User)
                               $readRef(calendar.User._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.User.calendar$User$_split_0._Impl src =
                  (calendar.User.calendar$User$_split_0._Impl) other;
                this.name = src.name;
                this.password = src.password;
                this.firstName = src.firstName;
                this.lastName = src.lastName;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy extends fabric.lang.Object._Proxy
              implements calendar.User.calendar$User$_split_0._Static {
                public _Proxy(calendar.User.calendar$User$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.User.calendar$User$_split_0._Static
                  $instance;
                
                static {
                    calendar.
                      User.
                      calendar$User$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        User.
                        calendar$User$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.User.calendar$User$_split_0._Static.
                            _Impl.class);
                    $instance = (calendar.User.calendar$User$_split_0._Static)
                                  impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl extends fabric.lang.Object._Impl
              implements calendar.User.calendar$User$_split_0._Static {
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
                    return new calendar.User.calendar$User$_split_0._Static.
                             _Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { -126, -7, -89,
        -111, 4, -39, 91, -98, -48, 91, 99, 10, 86, -70, -8, 95, 76, 109, -26,
        -30, -50, -15, 77, 35, 63, 72, 52, -97, -54, -66, -23, 2 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511992872000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.User.calendar$User$_split_0 get$calendar$User$_split_0();
    
    public calendar.User.calendar$User$_split_0 set$calendar$User$_split_0(
      calendar.User.calendar$User$_split_0 val);
    
    public fabric.lang.security.Principal get$jif$calendar_User_p();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.User {
        public calendar.User.calendar$User$_split_0 get$calendar$User$_split_0(
          ) {
            return ((calendar.User._Impl) fetch()).get$calendar$User$_split_0();
        }
        
        public calendar.User.calendar$User$_split_0 set$calendar$User$_split_0(
          calendar.User.calendar$User$_split_0 val) {
            return ((calendar.User._Impl) fetch()).set$calendar$User$_split_0(
                                                     val);
        }
        
        public fabric.lang.security.Principal get$jif$calendar_User_p() {
            return ((calendar.User._Impl) fetch()).get$jif$calendar_User_p();
        }
        
        public calendar.User calendar$User$(java.lang.String arg1,
                                            java.lang.String arg2,
                                            java.lang.String arg3,
                                            java.lang.String arg4) {
            return ((calendar.User) fetch()).calendar$User$(arg1, arg2, arg3,
                                                            arg4);
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return calendar.User._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static calendar.User jif$cast$calendar_User(
          fabric.lang.security.Principal arg1, fabric.lang.Object arg2) {
            return calendar.User._Impl.jif$cast$calendar_User(arg1, arg2);
        }
        
        public _Proxy(User._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.User {
        public calendar.User calendar$User$(final java.lang.String n,
                                            final java.lang.String pw,
                                            final java.lang.String f,
                                            final java.lang.String l) {
            ((calendar.User._Impl) this.fetch()).jif$init();
            {
                this.fabric$lang$Object$();
                this.get$calendar$User$_split_0().set$name(n);
                this.get$calendar$User$_split_0().set$password(pw);
                this.get$calendar$User$_split_0().set$firstName(f);
                this.get$calendar$User$_split_0().set$lastName(l);
            }
            return (calendar.User) this.$getProxy();
        }
        
        public calendar.User.calendar$User$_split_0 get$calendar$User$_split_0(
          ) {
            return this.calendar$User$_split_0;
        }
        
        public calendar.User.calendar$User$_split_0 set$calendar$User$_split_0(
          calendar.User.calendar$User$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$User$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$User$_split_0 calendar$User$_split_0;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Principal jif$p) {
            super($location);
            this.jif$calendar_User_p = jif$p;
        }
        
        private void jif$init() {
            this.set$calendar$User$_split_0(
                   (calendar$User$_split_0)
                     new calendar.User.calendar$User$_split_0._Impl(
                       this.$getStore(),
                       (calendar.User) this.$getProxy()).$getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Principal jif$p,
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
                            fabric.principals.ServletPrincipal._Impl.
                                getInstance(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof calendar.User) {
                calendar.User c = (calendar.User)
                                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.PrincipalUtil._Impl.
                  equivalentTo(c.get$jif$calendar_User_p(), jif$p);
            }
            return false;
        }
        
        public static calendar.User jif$cast$calendar_User(
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.User._Impl.jif$Instanceof(jif$p, o))
                return (calendar.User) fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Principal get$jif$calendar_User_p() {
            return this.jif$calendar_User_p;
        }
        
        private fabric.lang.security.Principal jif$calendar_User_p;
        
        public fabric.lang.Object $initLabels() {
            this.
              set$$updateLabel(
                fabric.lang.security.LabelUtil._Impl.
                    toLabel(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          readerPolicy(
                            this.$getStore(),
                            fabric.principals.ServletPrincipal._Impl.
                                getInstance(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicy(
                            this.$getStore(),
                            fabric.principals.ServletPrincipal._Impl.
                                getInstance(),
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
                            fabric.principals.ServletPrincipal._Impl.
                                getInstance(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (calendar.User) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$User$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.User._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$User$_split_0, refTypes, out,
                      intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_User_p, refTypes, out,
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
            this.calendar$User$_split_0 =
              (calendar.User.calendar$User$_split_0)
                $readRef(calendar.User.calendar$User$_split_0._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_User_p =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.User._Impl src = (calendar.User._Impl) other;
            this.calendar$User$_split_0 = src.calendar$User$_split_0;
            this.jif$calendar_User_p = src.jif$calendar_User_p;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.User._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.User._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.User._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.User._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.User._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.User._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.User._Static $instance;
            
            static {
                calendar.
                  User.
                  _Static.
                  _Impl
                  impl =
                  (calendar.User._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.User._Static._Impl.class);
                $instance = (calendar.User._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.User._Static {
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
                return new calendar.User._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm4 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled7 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff5 = 1;
                        boolean $doBackoff6 = true;
                        $label0: for (boolean $commit1 = false; !$commit1; ) {
                            if ($backoffEnabled7) {
                                if ($doBackoff6) {
                                    if ($backoff5 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff5);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e2) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff5 < 5000) $backoff5 *= 2;
                                }
                                $doBackoff6 = $backoff5 <= 32 || !$doBackoff6;
                            }
                            $commit1 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
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
                                if ($tm4.checkForStaleObjects())
                                    continue $label0;
                                throw new fabric.worker.AbortException($e2);
                            }
                            finally {
                                if ($commit1) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e2) {
                                        $commit1 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e2) {
                                        $commit1 = false;
                                        fabric.common.TransactionID
                                          $currentTid3 = $tm4.getCurrentTid();
                                        if ($currentTid3 != null) {
                                            if ($e2.tid.equals($currentTid3) ||
                                                  !$e2.tid.isDescendantOf(
                                                             $currentTid3)) {
                                                throw $e2;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit1) {
                                    {  }
                                    continue $label0;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -126, -7, -89, -111, 4,
    -39, 91, -98, -48, 91, 99, 10, 86, -70, -8, 95, 76, 109, -26, -30, -50, -15,
    77, 35, 63, 72, 52, -97, -54, -66, -23, 2 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511992872000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "o6WacynU9OH7btow9f2P84jR17/5PN63/2B7ePX+oUszX279N5i3fpv4iPKzVxuPnIWG7rt0cm+nO/cGhJ4ItTgJvcU9YaGjM149XvGgpKXx7vLhlM93VoGNC7y6EEG5xOZaVR476XL35Lm5zObzQN21mkvXznTxQlJP8uMPCez9RJVkceOpewF3Tlt874rO6DtX6W9/36j0AeVHqW+qRxW6Tc+Mb90++sTRq1oqObcerFOfkFz5taOPHXla9jZqX7e4dXx8fPv2nY/zR69VVuCC8C4r3JUqa+/v1ZrHLvOtqv1UEDxENJ9+SN1frJJPxo3HT5dZt1qeRKqqxzpuXKsYcUmIT1VDPH+fEB/5me8XIR7ipUcn5ln2fUeTvFqap3ro67derYOpR4c9qBZPHU485E6D3odfZ8Qf5FwNFLx09LD+h4jxobn/8VGJH1M/uuUffazESOI4t48Oil/2diLtzgPD7XTJGmdZxfwkRdGiqG9oin3ruyH3rOfhZ+zXBbcOAeFD2VaLDz9v3a7ydHULh4/9ULt1+6XviiWX5gg1SdVC1i/5nf/pJgrObhccfl/GzdlwpyL8bik9G+EiR4Kz0lu3/3QrLsegvFjb1v39uuz2nYOQzTOQHVUwrYxH9TxSSgtxqy7x75wD4GE3LWrxa7uktEkl7uOFf0s5fsCW+1KNyNt3XrsHVd/Jxlw9j++fXGe511ZcPW/VPPUwnr1I7wHkD7kN8sZDrM9fqZLXy03jXrV8kA167ESDL5qh0ztP7z81P6cFVe3N793Cq+Rzdas3H7KYv14lv1T6ZwfhRPG9EnrQTlg7t8/eZ0SvWd8vRvTEeh6EfFRvELUKRPVuGBtmdHwzCdSSwLq4xPb/gW06DFdq9/fMCD18xP/XrE1W1nz/L+32nRNcHHasA7n/Hxj/l7ahY8X39JNFlpKoNZaVwri+HBlVRSfbQ8WBO/e5oG9zTLvP4fzSQx3OLz+k7m9Xya/EjXdcMCa1fX2QaXzmPtN45fr3mWmszwj3sfnsqFBf8z++r/72nZeOvtNR4viAhJsVCG4eLPDNWw8+OXy3Yvs7DxXb33tI3W9Uya/FjacvLaUq/uy+PCJU9FcXTn/oAVfQT/4QofT/ofbmH0xeeu/bXD9//31/UTnp9+UvPv34D3xx+a/rK9Znf3a4QTce10s/+uLdygv560Go6WZN/I3DTcsDy/5Bedg55Xr1+6v1Ufi58z3+uSSs/jPz1n/+gT++/vji6yd3CRtHn/rvv/yXr/3eq1/8Z68qT6x+44/v0u5/+Mbvfpt58YfJ5i/909/8o6v/GyzJHXjLMwAA";
}
