package calendar;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
public interface Config extends fabric.lang.Object {
    public calendar.Config calendar$Config$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511911753000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            return ((calendar.Config) fetch()).calendar$Config$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.Config) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          fabric.lang.Object arg1) {
            return calendar.Config._Impl.jif$cast$calendar_Config(arg1);
        }
        
        public _Proxy(Config._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static final class _Impl extends fabric.lang.Object._Impl
      implements calendar.Config {
        public calendar.Config calendar$Config$() {
            ((calendar.Config._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.Config) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() { this.calendar$Config$(); }
        
        private void jif$init() {  }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof calendar.Config;
        }
        
        public static calendar.Config jif$cast$calendar_Config(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.Config._Impl.jif$Instanceof(o))
                return (calendar.Config) fabric.lang.Object._Proxy.$getProxy(o);
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
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.Config) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.Config._Proxy(this);
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
        
        public java.lang.String get$calendarStoreName();
        
        public java.lang.String set$calendarStoreName(java.lang.String val);
        
        public java.lang.String get$calendarMapKey();
        
        public java.lang.String set$calendarMapKey(java.lang.String val);
        
        public java.lang.String get$calendarPrincipalMapKey();
        
        public java.lang.String set$calendarPrincipalMapKey(
          java.lang.String val);
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.Config._Static._Impl) fetch()).get$worker$();
            }
            
            public java.lang.String get$calendarStoreName() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarStoreName();
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarStoreName(val);
            }
            
            public java.lang.String get$calendarMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarMapKey();
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarMapKey(val);
            }
            
            public java.lang.String get$calendarPrincipalMapKey() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$calendarPrincipalMapKey();
            }
            
            public java.lang.String set$calendarPrincipalMapKey(
              java.lang.String val) {
                return ((calendar.Config._Static._Impl) fetch()).
                  set$calendarPrincipalMapKey(val);
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.Config._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.Config._Static._Impl impl) { super(impl); }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.Config._Static $instance;
            
            static {
                calendar.
                  Config.
                  _Static.
                  _Impl
                  impl =
                  (calendar.Config._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.Config._Static._Impl.class);
                $instance = (calendar.Config._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.Config._Static {
            public fabric.worker.Worker get$worker$() { return this.worker$; }
            
            fabric.worker.Worker worker$;
            
            public java.lang.String get$calendarStoreName() {
                return this.calendarStoreName;
            }
            
            public java.lang.String set$calendarStoreName(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarStoreName = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarStoreName;
            
            public java.lang.String get$calendarMapKey() {
                return this.calendarMapKey;
            }
            
            public java.lang.String set$calendarMapKey(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarMapKey;
            
            public java.lang.String get$calendarPrincipalMapKey() {
                return this.calendarPrincipalMapKey;
            }
            
            public java.lang.String set$calendarPrincipalMapKey(
              java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.calendarPrincipalMapKey = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public java.lang.String calendarPrincipalMapKey;
            
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
                $writeInline(out, this.calendarStoreName);
                $writeInline(out, this.calendarMapKey);
                $writeInline(out, this.calendarPrincipalMapKey);
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
                this.calendarStoreName = (java.lang.String) in.readObject();
                this.calendarMapKey = (java.lang.String) in.readObject();
                this.calendarPrincipalMapKey = (java.lang.String)
                                                 in.readObject();
                this.jlc$CompilerVersion$fabric = (java.lang.String)
                                                    in.readObject();
                this.jlc$SourceLastModified$fabric = in.readLong();
                this.jlc$ClassType$fabric = (java.lang.String) in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.Config._Static._Proxy(this);
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
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarStoreName("store");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarMapKey("calendar");
                                calendar.Config._Static._Proxy.$instance.
                                  set$calendarPrincipalMapKey(
                                    "servletPrincipal");
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
    
    public static final byte[] $classHash = new byte[] { 3, -74, 35, 115, 105,
    -44, -78, 109, 56, 86, 116, 2, -118, -28, 16, 72, 52, -109, -75, -62, -87,
    27, 75, 47, -49, -109, 102, 80, -91, 19, 0, 91 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511911753000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "H4sIAAAAAAAAAK16e6zj2HkfZ3Z2Zme93pnd9drrtXd9vTtxZ6L1pSTqRU/WqUg9SJEUJZEUJS6cMd/im+JDpORskAZN7MbAtonXToImBgo4bZNsYjSAGwSBkbRo80CCFgmCPoA28R8OksDxH0HRtH+0TQ8p3Tt37jzsGBbAQ+qc833nO9/jdw7Px3e+CT0eR9ArhqxY7nGyDfX4eCArJD2Ro1jXcFeOYx7U3lHfdYn8wl/8C+3li9BFGnpKlf3At1TZvePHCfQ0bcsbGfb1BBZm5O03oKtqQUjI8SqBLr6B5RF0FAbu1nSD5DDIffw/X4Hf/qkfuP6rj0HXJOia5XOJnFgqHviJnicS9JSne4oexV1N0zUJesbXdY3TI0t2rR3oGPgS9Gxsmb6cpJEez/Q4cDdFx2fjNNSjcsyTykL8AIgdpWoSRED863vx08RyYdqKk9s0dNmwdFeL19APQZdo6HHDlU3Q8b30ySzgkiM8KOpB9yctIGZkyKp+QnLJsXwtgT50nuJ0xjco0AGQXvH0ZBWcDnXJl0EF9OxeJFf2TZhLIss3QdfHgxSMkkAvPpQp6PREKKuObOp3EuiF8/0m+ybQ62qploIkgZ4/363kBGz24jmbnbHWN8ff99anfMK/CF0AMmu66hbyPwGIXj5HNNMNPdJ9Vd8TPvW99Bfk9371MxchCHR+/lznfZ9f+8G//vuvvfxbv7vv84EH9GEVW1eTO+qXlKf/8IP4LfSxQownwiC2Cle4Z+alVSeHltt5CLz9vacci8bjk8bfmv328od/Uf/GRehJErqsBm7qAa96Rg280HL1aKj7eiQnukZCV3Vfw8t2EroCnmnL1/e1rGHEekJCl9yy6nJQ/gcqMgCLQkVXwLPlG8HJcygnq/I5DyEIeje4oPeD6zFwvXa4HyUQAwsxcH64X3i7AhwG7umxkwQhzPR9884kCgp9wLjsAhnk6KMghCNLheNIhdVDHQxCybDMYxDp4XebYV7M4Hp24QJQ7ofUQNMVOQaWOngNNnFBYBCBq+nRHdV966sk9NxXf6b0nKuFt8fAY0vdXADW/uB5nDhL+3aK9f/6V+78/t7rCtqD6hLo2olYx3uxgCRPFSF0DEDpGIDSOxfyY/yL5C+VnnI5LkPqlPgqmMPH3ACwyKELF8ppvKckLv0DWNcBqAGA4alb3CdGn/zMK8AqeZhdArYput44HyZ3wYUETzLw/TvqtU//xd98+QtvBncDJoFu3BfH91MWcfjKeZ1EgaprAOfusv/eI/krd7765o2LBYZcBfCWyMABAVa8fH6Me+Lx9gm2Fap4nIbeZQSRJ7tF0wkgPZmsoiC7W1Pa+uny+Zm/Bb8L4Pp/xVW4blFR3AGA4YewOTqNmzDc+0mh3XMzKnH0dS78uf/yH/4SKVeYE8i9dgabOT25fSbMC2bXyoB+5q6x+EjXQb///tOTz33+m59+o7QU6PHqgwa8UZSFnDKQL4h+9HfX//VP/+RLf3zxrnUT6HKYKq6llpK/Chh95O5QAAFcECRAkviG4HuBZhmWrLh64Sn/59r31L7yV29d35vbBTV75UXQa9+awd3692PQD//+D/yvl0s2F9RiBbqrjrvd9rD23F3O3SiSt4Uc+T/4o5d+5nfknwNuD0AptnZ6iTNQOT2onFW9tOVHy7J2rq1RFK/kZdsHy/or8f0QPyjWyru+KMHv/OyL+Me/sY/wU18seHz4ARE+l8+ESf0Xvf958ZXL//4idEWCrpfLtOwnc9lNC6tKYKGN8UMlDb37nvZ7F839CnH7NNY+eD4Ozgx7PgruIgt4LnoXz0/uHb/0g/wCFBYPHyspvqcsbxZFpdTRxaRAmGL7kgDGlg9gpSRLoCtZEDl6dKOkeD6B3mOUuHq8rz4Wy1vR9uI+UoqytY81wPf5wi7fB67L4HrrcC9R7LlSnPecyIU9WK7HisfXiuJ1gHmW56VJ4W4nwj1zAqEcCAZ9XCDzQczrpWcVej3eb0bKhvcn0FMFcIaunBS4kT9I5hcKmb8fXFdBOD22v0P/7QEy099S5qIYnAj79ImwjBxS+raoJR6qMwZcT4Hxf+JwXz5g/Onfbfz3nYw/AfpQrVB2HyzIwV8AkjxePUaOq8X/+bc11MdPhnrRdtUbJ3A6B6s2iPgbe8d52GggSJ++azM6ANvHz379n/zBP371T0FQjqDHN0XAgFg8Y9hxWuyvf+ydz7/0rre/9tkSA4GmPnnpb360FPGNolgk0EuFMFyQRqpOy3HClKClawd5HgAOQD8egOvNYf+nf+btH//b47fe3gPjfpP86n371LM0+41yqYx37+cHRvnwo0YpKQZ//uU3f+Nfvvnp/Sby2Xu3fH0/9X75P/3fPzj+6a/93gM2E5fcYL87OG/Ea18nGjHZPflRNQlHMKE2cyrpdqhg2yE2xSidXM5MvEOlFaqJ6eKWxHrydOT0TdvKEK3T8Vx0i6IIvUEUrKtJUynXlnVCRhoeOQxoNRNCDau3YkyINUWerhNUGNXWgWzzA1OP6mzI1BFiHcAovPORja2IWjvO0Cba3O02FQNGxEqnWdmtthVOcBifnnurRdPop7TbC6pyx1/UqrgSYkzVlRgy1+V+ix502vqcR4WkQkQCT6YzOegLMjesygvKiezeqDfmxdY8NsO+L1FDYxt4ztqbNZVtygzM+WDOzWbOmKWWEr2uDaSV2DeDWn8btyutLmyHg+1g0OtXeXlmi2uJMi1uNR3WNjimz1muv0OE1YhwV5ZES2vdrPDpKlBE06k55kpe9MHSQY+n3ZXmdwcT345zNe95bX4RbHlx1gncZbtm4QNPJldzHFnlgqY6/RkntTxq6XRbqkq3AjPBm6TluTHZ1mciGTIuhQ2Efj5ihp63mGu7UejxVQ+3unOn1m/PzJE9wwYIJU6V9bK/HPA2vZB5JqgtZnWRcafIVs+sDjKXDM7vTBNRViayaDiLtL5IwsamQYyrcMcwvbDFMTUnGdn4egkmkzAOpU/m7DyIQnidb0bMylNaW5wbVJ1sUuPmmOsr+HSwCMm2OBxTXVJyW/7MVmtzwlli6FLWp7V+3vOT2WbqA/vp48FCm1u66Mog8hSUittk1sVasdZB8Jq4IbQIG4wki2+5bpYK1a3irDjGs+guKdrLTiwPu7gj8Q4F+5Q3DAxs2RzJbduVhO6Sm8jLlJoyWTLgx17dNlsis80lC8+wmMM8Wx4N2F6jHTYGje16SUrdfjgRsKWa8ynutqb9jW7kO1Wvc84coShrTpEWtlsFwXZrdzALC3qzcbXKIfNlN5zyc6tGTrie4LfNNmeaTGTGTNNjWUP3UGkaK/4OGeSdjBwqbGps4/lOmTUCGm6hzM6B8YoQYLbreSHZIrZG09o10tZWrwXksDsgNirDs+kYaSoTYzJOkApLVNucFbS5fi40Fxnb8CxuzS6rnKy07Dm3Yq3WrOeS2HoXjSp2Asbc+iNysa35CynqE+OePWIlp5q7i3rPUuhu16kJmF7hHHeRaNVqhqFue8qxfZ7ECZ5kfWzUGsyTmuPE7b5uTvCJ0uca7djoWspsFlRXAipwPpfOTZ6L6faMIC2fJEnWpCuU6e6wKsOBV6/prheS/YZJTepwXVpOu8g6cVRrOd5JQbhewUsS8yPKkhxx0esmtssFve56NtD1WR9rup2G1xfZmcDOcYqgiFVbWnWlDc0jzZoeGyxKVkxB14RV5E3bWTVfRrtYwDk5zHBVwNwK2902VHu1WG0TlhkNLCc3t9Vw1TZxjV4Bbx4MTGFq8WQ1tEf2AENWCE508Q49XhtxJ1m3DRWZ5jol2kreGGzUobXrtXSeDldVZpDNSXlkiOswGSruOg/JgNKrvU1vIcsDhdzWpYUaiPI8wxehvRojs6nJ1Qfd4TQSJSki5f6OE7rcjhi0MJ7QJXLg0HVacNOR0supnaRW+sYsrzTmi/kiEUCUxLjnYTQW2H7ADqpzeaqYtboIB323wfiIVVvJ9WZN7iqWFKyCnjgc7XpYvk7GJm7ToWguXGWuNihmoUhzKq5hCw1Jkwjv+mQ+6DbQMTpcdaekotVgLajUYLQ2Txazvi+w1XSEVZFMz6KeDcTjJ/zaZUjdSFtA6XC8UWxfWi2nzHCU1rEsEfElNhNxGKMmmi5GSruGwm21Rwu8TvLjFdOB69PFil+2J6KR4R181zEaJD4zu6icMdw0YYfhttO3ex6H5tJ07DgekZvparhFAjesy06E89VtPrUrDCvry9QwhppDbvSshyPqwg6lyqgjpSzCz8OeskDtzq6qDEcWbe3SlTdMG1kv0vmF2qa1ObI0F6TQ3thJRGoTfJOs2OloOUxG7HaDTxginjajceRx9XTJCjVTaUfxCATBbrHEtclYHam2mMvTRd/sdKoWjeodZNTm64kNpNomg1Er6Y3XvZE+3g2xSlZVB8qsmyZZuiOcYYPciQrLpC0h7CBNHjCId7Hmr3Fi7Xgy0Q+wSsgRLjkZ9gb4pAfe4bpg0Uoxi2mmEpNS5JLZpHM6DbVaZOUBm7bVrEGzG6bfS5bYqrW0ZyvOlcRo5/l2vcVu1GheVRO1inhLQehMdvyCjDZDZO3IbsJQTm/usdi0JosUrwwnpBr1YtJO8wTAleNt6Iyursd9c8uFgag3DNFHIj+PR4qB6ca2MavivaqTeM1QXcCaWYUXE58wVKeR16vobExEI0n12lVXq7SbWkyIQ3U8VbSqUB3Ue3Jjg9JWpTX25Yk2J9o72m2vW4up761XUYzLlINL1kb0KstmumZwdG12W5wsrmbaYJNGG1gJqst0o3E1m+vQ9lLIh9ZmtKIaU9UdRNjCnVR2Kjcboa1IDpqkvBjsYLGT+oZfDS20vQMx2SEznVW4TZvq0BPEEtY60q9redfvOX0/DyMRb9sdmyY7vE9SLX7BZ7Vas9aojJXdGjG6DZwaL/WNJ0jbJuMrCt2xcrY+9MdWIiymzTraXTY6UcQqjbXvGy4vwtN0EjcdIpvySl3opfw2X6RZe9kld/5Kc3crcS3LcdOu6RvfT3y5khAhgZqRQtVs13Ar2JQVFvbcxpsteezTddQX6sDEacuRJ2u/3pGnjmhlSbwSmx4tVoeZ0zFnc8cdkmxGKdX1BqUQFN3iM6+Z7VqSixqVrK220F6ewZq1mCzXQbeLL9OFKs1MtdKynAoR6hYFgMQXHJvnubYEHA5AbZu3wqQxWWorLXOGRscebWbVydJrsH0J0auLTbJsCGNl5I2bFa0+QoejZZcGwb3EayzNttBKp10ZJw45FNARsZ6qRCAM8UleY2yi35jBYXXjVHdbepAO102L2I5bKuXbAi7sRHdndRQk2q4irRmmqcNWbbQiYQy6VTCn4Wqwb6dtlPDq/YoddjNuFi6HmemjI4dgl2g0wzKNJetOLYzN/qINwx1mNeHWNZa11Z03DJuhWfVErzXs6Z3GMEGjrp1QhKqM+/7K6pD5El1iyKzhdg13vJ6ySq81YRnV7EeDOjVrsG2i1kkYnkHysNsRRMHDjPFWGjXoHU8TDalVb+U7ZqIzWaUL86Y03OQySyjhwFOr3QyWsHYHTft2NBeJnk311wA9MK6i1AIJLGR8fVzTm7U1vFX6aV8R++tObRH1mYwkO6smPl/VVm2xGmsZl9pdzbbZPNYIC/CuNVKRbEq1zs7wQsn17BqPr4No3nJblRFtEJo90RaLmb1cLDMGXiuhM5hmQ4aa2pNJuzdWZvKIXE+IJDRH4rJmjJ2JSiUNcW2yWMjMpnUxcxmsPydwGaaIJc3N641hl1/EMK3jWZ30B7RtcCKuSMtJvyKjom+MBqIiwFNKXEWtbnOoh4mxHcp0h6lm5HSSV2erYYfRrQpmo+3JEMsExRNHO1aERcPcEPlOwDoMFXgyzBlZy6Ia6VjJDSLH2TG67daHs0ZkZ3Uf77itSa2qael8u4mzxQKfwgFB+4u1rQ42fHsWTNYZ36/5cUdMSbiSoHldzXinLm7mlA+risJ22kxDHJpTht/2+4yDBLE36XIhucEbYxvuYhNyrVXWScb3GpSXL7sjAq8PhJlIZBrRXxJDveMjY9SIskaPbE0GU4XwwFuFymoDQteaMCNVZDLjto3Vkgebobbq1Oo9N6+5FuJVcg+Ne2mlqu5aWSNtOq4QGfBQpURuhyC+llfQIQEHtlQhkP587lHrOkcpvflEGeNSrGyaGxwm5sNtT5S0RT8ahRUf67Q24txE8tVCqlE0rTY24PVvNdbVSVBxjWWqsU2Xqg8Rbqu49cVGSptNu+60dkLEzNF5R0a1JTonuzMX9eZhnjQQL3HlIJ+x2mhmW9agYRudiTkz1ibY5FYScrGJdpMxPAQ4j2ybBjJRmLWQsGKgknlGVZeMIsF5V3SEJNcIvlZ3kc1CRRC0NpoNfHnr8o3VTI0asDSoCS2OZ8XxNkb8wTxG4DkMNuhgaWjWwQ51lLpkWu0wM1msTqJKr+/RlaaCVmKW76IbM8QojGfQXPOpqRX2uEqGNmqBz+/qOIkQ0aSDgO1ehg0qVWsggT0O0Ecf3gnrWS+1YFGbbqhZFbYxk0u2pipOm70t2Pv5PIl2EJ+tkLCLqixB2uN6x0I7kW9W1SbRDJtt0o2NRaiuK3XOVlSkDnanNMOmXIMkHLoJJ1NmZI0XmL/qqEaXjbjYZmDY8VGwLrujcchS3ny+pad0u0fytbRu8kENAxs5YTxI2bYuBEDYAGmNjZaEGgR4rS9e983Decd7ysOX06Td+WOX/CEngKdHOR/PT4+iyt9Th6TOhw73584cRZ05ZoWKQ46XHpZ/Kw84vvQjb39RY3++dvFwVqsl0NUkCD/q6hvdPXdi++H78rtMmXW8e/D6tW+8hOLOn5n745IPnRv5fO9fYN75veFH1J+8CD12esJ6X6rzXqLb956rPhnpSRr5/D2nq0f36qr4FTP46Mn97LFdqf6i+HuPOL/OH9G2K4o0ga6fnOTd2GeObtw9+IlO5blSkH2kSAkc5LqwT3PI96c5Pna0TuXYWqdBot/cZw+ONoGlHdmWccPyN4Gj93TjTKrn5q2jTyUrKz4+L8jNW7ffvHWaNSkdrShu3auly+elKlp/KAwfMfUfeUTbPyyKH0ygFx4mbkn1ycNJXHFTE+hSMcFzKnuiYPnM/Sr7/m+lssjagMqzOrOSQkdHb3yCOzqvkPORdyGBrhw4nIu8Kw/S02cfqaefeETb54riHyXQEyciFv9/7JwOni66v3SfDi7c+BY62GcPjg7eowSBq8t+qYyTcAqMm2+UqYWjPSR9SvaUN8uT3P3TPv9RPh8FnxgA9VnG0c3g6PXXj/zUdW8d7eMPULuxfvuQhigPgmNdTSMr2R7TsqK7QnFcKquqHsf4Sledmw8e7oRo/++Ucv/XD4rpBr7uJ/HNW68dBWX1rdsHEYBU1umsjva+f7/nPxxiXz8k5+611YVDfvaQwnj27BT3ynlwEqNk9k8fYfh/VhSfT6Cn7zXHg8LiysFyZ73iJEX6wok3nFQUrTe+K3Mu/v5s2eGXHjGPXy6Kf34IdFWOkxsn+HNnb4OH4uCz9zn0ReLbw8G94o/KeCmdJC4Du0S/G+BVHNCV1UevP8StH+lnSVBW3NyzM/WkTGQVHvcdMFOCJAm8QhPfIYMMtOjRJADz3n6HIp3mls7OMTyt/a6xuXXr9sEG+0jfC/2dGeHeYD9WgQIPOgCDlIafyFFSJvDjouoAAsXwt+9D9293uftXj4Txrzyi7deK4ssJ9K4zPlnGz4Mc//r9q5n6d9gA3Df7Yk3TN8AC5ddYx/e137r9gBXv29XJbzxSJ7/5iLZ/UxS/nkDXzglUrnB5Al3e40PxzcEHHvC1z+H7MxX/d/qX/ox67fmHfOnzwn1fBB7ofuWL15543xeF/1x+y3L6bdlVGnrCACvX2dz8mefLYaQbVin+1X2mfq+03wYr9AmuFf9/p9w+vngXIl9Mo+ITxXf+x/v+9+Un+K8dEp/Q0WP/+tXY+uNf9Trz5OKPf/060fjcV/7tL3yAgv/j54zJzz8HvfH/AUD/yjs6KQAA";
}
