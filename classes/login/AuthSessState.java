package login;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import sif.servlet.SessionState;
import sif.servlet.SessionPrincipal;
import fabricated.util.*;

public interface AuthSessState extends sif.servlet.SessionState {
    public login.AuthSessState login$AuthSessState$(
      final java.lang.String id, final sif.servlet.SessionPrincipal session);
    
    public login.AuthSessState login$AuthSessState$(
      final sif.servlet.SessionPrincipal sp, final java.lang.String si,
      final fabric.lang.security.Principal cu);
    
    public fabric.lang.security.Principal currentUser();
    
    public void currentUser(final fabric.lang.security.Principal cu);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511380891000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface login$AuthSessState$_split_0
      extends fabric.lang.Object {
        public fabric.lang.security.Principal get$currentUser();
        
        public fabric.lang.security.Principal set$currentUser(
          fabric.lang.security.Principal val);
        
        public fabric.lang.Object $initLabels();
        
        public login.AuthSessState get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements login$AuthSessState$_split_0 {
            public fabric.lang.security.Principal get$currentUser() {
                return ((login.AuthSessState.login$AuthSessState$_split_0._Impl)
                          fetch()).get$currentUser();
            }
            
            public fabric.lang.security.Principal set$currentUser(
              fabric.lang.security.Principal val) {
                return ((login.AuthSessState.login$AuthSessState$_split_0._Impl)
                          fetch()).set$currentUser(val);
            }
            
            public login.AuthSessState get$$root() {
                return ((login.AuthSessState.login$AuthSessState$_split_0._Impl)
                          fetch()).get$$root();
            }
            
            public _Proxy(login$AuthSessState$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements login$AuthSessState$_split_0 {
            public fabric.lang.security.Principal get$currentUser() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.currentUser;
            }
            
            public fabric.lang.security.Principal set$currentUser(
              fabric.lang.security.Principal val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.currentUser = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Principal currentUser;
            
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
                                this.get$$root().
                                    get$sif$servlet$SessionState$_split_0().
                                    get$sessionPrincipal(),
                                fabric.lang.security.PrincipalUtil._Impl.
                                    topPrincipal())));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (login$AuthSessState$_split_0) this.$getProxy();
            }
            
            public login.AuthSessState get$$root() { return this.$root; }
            
            private login.AuthSessState $root;
            
            public _Impl(fabric.worker.Store $location,
                         login.AuthSessState root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new login.AuthSessState.login$AuthSessState$_split_0.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.currentUser, refTypes, out,
                          intraStoreRefs, interStoreRefs);
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
                this.currentUser =
                  (fabric.lang.security.Principal)
                    $readRef(fabric.lang.security.Principal._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.$root = (login.AuthSessState)
                               $readRef(login.AuthSessState._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                login.AuthSessState.login$AuthSessState$_split_0._Impl src =
                  (login.AuthSessState.login$AuthSessState$_split_0._Impl)
                    other;
                this.currentUser = src.currentUser;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements login.AuthSessState.login$AuthSessState$_split_0.
                           _Static
            {
                public _Proxy(login.AuthSessState.login$AuthSessState$_split_0.
                                _Static._Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final login.AuthSessState.
                  login$AuthSessState$_split_0._Static $instance;
                
                static {
                    login.
                      AuthSessState.
                      login$AuthSessState$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (login.
                        AuthSessState.
                        login$AuthSessState$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          login.AuthSessState.login$AuthSessState$_split_0.
                            _Static._Impl.class);
                    $instance =
                      (login.AuthSessState.login$AuthSessState$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements login.AuthSessState.login$AuthSessState$_split_0.
                           _Static
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
                    return new login.AuthSessState.login$AuthSessState$_split_0.
                             _Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 96, 108, 28, -33,
        -128, 87, 7, 104, 127, -80, 21, -30, 51, -52, 8, 113, 49, 57, 44, -3,
        79, -34, 24, 90, -11, 110, -28, -43, -22, -5, -28, 91 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511380891000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "H4sIAAAAAAAAANVYb4wbRxUf+y6+8+XIXS5/mr+XTWrKXXqxe41UNXGLyLlJ49YhJs4VcafEGe/O+rY33t3bGV98DYEAou2nfChpaCUa8SGoohwFIVVISJH6gT+tWlUC8fcDbVS1ohDyoUIFJCjwZma9a6+dI6qERCzteHbmzZs378/vvdnl62gV89AuE1csmuZLLmHpQ7iSLxSxx4iRo5ix4zBa1lf35i++97wxGkfxAhrUse3Ylo5p2WYcrSk8ihdxxiY8M30sn51FSV0sPIzZHEfx2amGhzTXoUtV6nB/kw7+T9+ZufD1k8M/6EFDM2jIskscc0vPOTYnDT6DBmukViEeO2AYxJhBa21CjBLxLEytx4DQsWfQCLOqNuZ1j7BjhDl0URCOsLpLPLlnc1CI74DYXl3njgfiDyvx69yimYLFeLaAEqZFqMEW0BdQbwGtMimuAuHGQvMUGckxc0iMA/mABWJ6JtZJc0nvvGUbHO2IrghOnHoYCGBpX43wOSfYqtfGMIBGlEgU29VMiXuWXQXSVU4dduFoyw2ZAlG/i/V5XCVljjZF6YpqCqiSUi1iCUcbomSSE9hsS8RmLda6/un7zp+xD9txFAOZDaJTIX8/LBqNLDpGTOIRWydq4eDuwkW88cqTcYSAeEOEWNH88PPvf2pi9OVXFM3WLjRHK48SnZf1y5U1P9+WG9/XI8Todx1mCVdoO7m0atGfyTZc8PaNAUcxmW5Ovnzsp5879wK5FkcDeZTQHVqvgVet1Z2aa1HiPUhs4mFOjDxKEtvIyfk86oN+wbKJGj1qmozwPOqlcijhyHdQkQkshIr6oG/ZptPsu5jPyX7DRQithwel4Ikh9ZP/PPajnC+EFkihjfE5i6UZuDBJvf34U/sz0wziI3NQBEQFfCrzAGHz3HEzRw7a1XLRc4TKMhDonqVnmAdPEC7NUf9Peh0jet2z+FLmQAVCBeu8CF6oWy6maSDbf+/EPXsm947v1xbqmFkLdYeTMbdeoZauMRm5mmnZmGoSCDTqVC07daDO50qEMRHaJFVmLrV4+S7tjDarNj6Da5WzabG76jVFUG/B/vJVgylwKy4OPaH5O3dno5xFrUpZtsULoB/KxtLp9Dgs9axFEMcXVwqqlrVJ66/2HIcHu610KMn8xBHt7LjrNoR9h0/HYuB6O3THIBXMwI/9mJoqUoCNww41iFfW6fkrebTuyrMyrpICCxjEs/ScGMTCtiiKtq69UJ86+P6L5ddUTIq1vmNxdJeUtf1IqZXkB1EHBQKlAdPTgOnLsUY6dyn/HRloCSYRKeCeFA5BHcgGDRSLyXOul4tleEFwzAPoAq4OjpdOPHTqyV09ENfu6V7h3kCaiqJMiM156GGAjrI+9MR7f/3exbNOiDccpTpgsHOlgLFdUaV5jk4M8PuQ/W4Nv1S+cjYVFxCchOzAMcQvQO1odI82OMs2U4NQxaoCWm06Xg1TMdXE8wE+5zmnwxHpDGtkfy0ooE/Ed64z4HtupYBfMRC6eJ4mwmgc4l4mobHxrCZPJqNLu1/OZlsiR7hTxIQy795fcp/77Rt/3CsrkmaKHmrJ5SXCsy1pQTAbkglgbeidxz1CgO73zxS/9vT1J2alawLF7d02TIlWGAaDQRzvq68s/O6tNy//Mh66M0cJpZNGYGH5S0QtLGZvd8VOd4SyQEqhYDIQlaWm7ZpjWKaFK5SI2Pnn0McnX/rz+WEVABRGlDt5aOK/MwjHN0+hc6+d/NuoZBPTRUkT6iskU3lyXcj5gOfhJSFH40u/2P7sz/BzAASQ5Zj1GJGJK+aHsxBqPUfrulhdTG2WFr1bku2R7aTQhlyM5Nw9otmp1LdVjsdZZ1FxSFRnYfjOZJa/sSX3yWsKNYPwFTy0Lqj5CG5BlrtfqH0Q35X4SRz1zaBhWRhimz+CaV34xQyUdiznDxbQx9rm28s0lWayATxti0JHy7ZR4AjRGvqCWvQHIlghlfQAPEl4/uD/P8/RZ24OCHKYQoGCvT2HQkSQZsq0mUkEu/u/YNqIIVcc5T55oJRsPyGa3b751UH/Db8YPP8SjxgXAxIU0UgnKHL0lf8DVAR9rW6pR5pRMKoYyVIkKGbCOkaSbeJoUDByKeYie/iQJ9p7A8uvEeff2ZEl0Bu3RpborLAi+UAif1YAvu8jD3X3kThHfT43DgEk+El9TcGb5CFe9koNNrpz6BHdO7koYUSRKt6KikUL4oAremj7jS4/8uJ2+csXLhlHvzWprigj7ReKg3a99t1ff/h6+pmrr3YpxhL+VTbcUJRBOzuu4EfkxTBEqqvXtu/Lzb9bVXvuiMgXpf72keVXH7xDfyqOegJI6riNti/KtgPRgEfADezjbXC0o710Ge1wyvg3bw2nbL0xqAhVAN52RRBFyixZxFQdIFV3DTiPnIRC5WZuLZJ2GrxCvXJHDvjsqoSXhE7G4B7yEZhVHM6dGmQn8yMyOA0zxCs6oImlLiKFVVmaWWYKTLZICU+JuIUaob3Og43kaKD5mxMoIG9VkRuMjo3DLzuhtZgA6zrspGQGG3TYJQ0p2vSPJNcqL5aE2ROl1rpSIoRoxm6iWjsF1dqNyxZjhTlTNCchRbR4VjNFjHQ6YPe00ICCYqU6WyIfwMjWLhdM/4OQnvsxufzuwxMbbnC53NTxic5f9+Klof7bLk3/Rt6Ogo89SSitzTqlraVLSz/hesS0pAKSqpBRancAq+VBxIsr0X6zaObk7Oa6Jz4YLv/ltr8n+o9flaU16FE7Rbe9de6zfXNf/P6Gt/e+3r8wuW/iw6Nvbpr5wH7nV3/6xzuz/wFFRnj3yBQAAA==";
    }
    
    public login.AuthSessState.login$AuthSessState$_split_0
      get$login$AuthSessState$_split_0();
    
    public login.AuthSessState.login$AuthSessState$_split_0
      set$login$AuthSessState$_split_0(
      login.AuthSessState.login$AuthSessState$_split_0 val);
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends sif.servlet.SessionState._Proxy
      implements login.AuthSessState {
        public login.AuthSessState.login$AuthSessState$_split_0
          get$login$AuthSessState$_split_0() {
            return ((login.AuthSessState._Impl) fetch()).
              get$login$AuthSessState$_split_0();
        }
        
        public login.AuthSessState.login$AuthSessState$_split_0
          set$login$AuthSessState$_split_0(
          login.AuthSessState.login$AuthSessState$_split_0 val) {
            return ((login.AuthSessState._Impl) fetch()).
              set$login$AuthSessState$_split_0(val);
        }
        
        public login.AuthSessState login$AuthSessState$(
          java.lang.String arg1, sif.servlet.SessionPrincipal arg2) {
            return ((login.AuthSessState) fetch()).login$AuthSessState$(arg1,
                                                                        arg2);
        }
        
        public login.AuthSessState login$AuthSessState$(
          sif.servlet.SessionPrincipal arg1, java.lang.String arg2,
          fabric.lang.security.Principal arg3) {
            return ((login.AuthSessState) fetch()).login$AuthSessState$(arg1,
                                                                        arg2,
                                                                        arg3);
        }
        
        public fabric.lang.security.Principal currentUser() {
            return ((login.AuthSessState) fetch()).currentUser();
        }
        
        public void currentUser(fabric.lang.security.Principal arg1) {
            ((login.AuthSessState) fetch()).currentUser(arg1);
        }
        
        public static login.AuthSessState jif$cast$login_AuthSessState(
          fabric.lang.Object arg1) {
            return login.AuthSessState._Impl.jif$cast$login_AuthSessState(arg1);
        }
        
        public _Proxy(AuthSessState._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends sif.servlet.SessionState._Impl
      implements login.AuthSessState {
        public login.AuthSessState login$AuthSessState$(
          final java.lang.String id,
          final sif.servlet.SessionPrincipal session) {
            ((login.AuthSessState._Impl) this.fetch()).jif$init();
            { this.sif$servlet$SessionState$(id, session); }
            return (login.AuthSessState) this.$getProxy();
        }
        
        public login.AuthSessState login$AuthSessState$(
          final sif.servlet.SessionPrincipal sp, final java.lang.String si,
          final fabric.lang.security.Principal cu) {
            ((login.AuthSessState._Impl) this.fetch()).jif$init();
            {
                this.sif$servlet$SessionState$(si, sp);
                if (fabric.lang.security.PrincipalUtil._Impl.
                      equivalentTo(
                        sp,
                        this.get$sif$servlet$SessionState$_split_0().
                            get$sessionPrincipal())) {
                    this.get$login$AuthSessState$_split_0().set$currentUser(cu);
                }
            }
            return (login.AuthSessState) this.$getProxy();
        }
        
        public fabric.lang.security.Principal currentUser() {
            return this.get$login$AuthSessState$_split_0().get$currentUser();
        }
        
        public void currentUser(final fabric.lang.security.Principal cu) {
            this.get$login$AuthSessState$_split_0().set$currentUser(cu);
        }
        
        public login.AuthSessState.login$AuthSessState$_split_0
          get$login$AuthSessState$_split_0() {
            return this.login$AuthSessState$_split_0;
        }
        
        public login.AuthSessState.login$AuthSessState$_split_0
          set$login$AuthSessState$_split_0(
          login.AuthSessState.login$AuthSessState$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.login$AuthSessState$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public login$AuthSessState$_split_0 login$AuthSessState$_split_0;
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        private void jif$init() {
            this.set$login$AuthSessState$_split_0(
                   (login$AuthSessState$_split_0)
                     new login.AuthSessState.login$AuthSessState$_split_0._Impl(
                       this.$getStore(),
                       (login.AuthSessState) this.$getProxy()).$getProxy());
            this.get$login$AuthSessState$_split_0().set$currentUser(null);
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
                            o.fetch().$getStore().getPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()),
                o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof login.AuthSessState;
        }
        
        public static login.AuthSessState jif$cast$login_AuthSessState(
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (login.AuthSessState._Impl.jif$Instanceof(o))
                return (login.AuthSessState)
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
                            this.get$sif$servlet$SessionState$_split_0().
                                get$sessionPrincipal(),
                            fabric.lang.security.PrincipalUtil._Impl.
                                topPrincipal())).
                    meet(
                      this.$getStore(),
                      fabric.lang.security.LabelUtil._Impl.
                          writerPolicyLabel(
                            this.$getStore(),
                            fabric.worker.Worker.getWorker().getPrincipal(),
                            fabric.worker.Worker.getWorker().getPrincipal()),
                      true));
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
                            this.fetch().$getStore().getPrincipal()),
                      fabric.lang.security.LabelUtil._Impl.topInteg()).
                    confPolicy());
            $initPartitions();
            return (login.AuthSessState) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$login$AuthSessState$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new login.AuthSessState._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.login$AuthSessState$_split_0, refTypes,
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
            this.login$AuthSessState$_split_0 =
              (login.AuthSessState.login$AuthSessState$_split_0)
                $readRef(
                  login.AuthSessState.login$AuthSessState$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            login.AuthSessState._Impl src = (login.AuthSessState._Impl) other;
            this.login$AuthSessState$_split_0 =
              src.login$AuthSessState$_split_0;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements login.AuthSessState._Static {
            public fabric.worker.Worker get$worker$() {
                return ((login.AuthSessState._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((login.AuthSessState._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((login.AuthSessState._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((login.AuthSessState._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(login.AuthSessState._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final login.AuthSessState._Static $instance;
            
            static {
                login.
                  AuthSessState.
                  _Static.
                  _Impl
                  impl =
                  (login.AuthSessState._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      login.AuthSessState._Static._Impl.class);
                $instance = (login.AuthSessState._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements login.AuthSessState._Static {
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
                return new login.AuthSessState._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm74 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled77 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff75 = 1;
                        boolean $doBackoff76 = true;
                        $label70: for (boolean $commit71 = false; !$commit71;
                                       ) {
                            if ($backoffEnabled77) {
                                if ($doBackoff76) {
                                    if ($backoff75 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff75);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e72) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff75 < 5000) $backoff75 *= 2;
                                }
                                $doBackoff76 = $backoff75 <= 32 ||
                                                 !$doBackoff76;
                            }
                            $commit71 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e72) {
                                $commit71 = false;
                                continue $label70;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e72) {
                                $commit71 = false;
                                fabric.common.TransactionID $currentTid73 =
                                  $tm74.getCurrentTid();
                                if ($e72.tid.isDescendantOf($currentTid73))
                                    continue $label70;
                                if ($currentTid73.parent != null) throw $e72;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e72) {
                                $commit71 = false;
                                if ($tm74.checkForStaleObjects())
                                    continue $label70;
                                throw new fabric.worker.AbortException($e72);
                            }
                            finally {
                                if ($commit71) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e72) {
                                        $commit71 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e72) {
                                        $commit71 = false;
                                        fabric.common.TransactionID
                                          $currentTid73 = $tm74.getCurrentTid();
                                        if ($currentTid73 != null) {
                                            if ($e72.tid.equals(
                                                           $currentTid73) ||
                                                  !$e72.tid.isDescendantOf(
                                                              $currentTid73)) {
                                                throw $e72;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit71) {
                                    {  }
                                    continue $label70;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -99, -41, 48, 66, 38,
    -121, 6, 27, 67, -69, -7, -73, 39, 28, 31, -74, 114, -102, 68, -79, -73,
    -99, 111, -1, -12, -80, -126, -97, 124, -101, 66, -10 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511380891000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}
