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
          "H4sIAAAAAAAAAM1Yb2wcRxWfOztnn2Nix03S/LU3ybX4UueOJBDSXNM2PpLmmnNj5eJItZUec3tz5633dte7c/a5IVCKoP0UiZKGVqLmS1BFa9qqUlUJKagf+NNSVAFCQJGAqFKhUYhEhIAi8e+9md3bu71zE1X9kJV2d3bmvTdv3rz3e2926SpZ4dhkW4kWND3BFyzmJA7TQiY7Tm2HFdM6dZwT0JtXV3Zmzr//XHEwTMJZ0qtSwzQ0lep5w+FkVfZhOkeTBuPJieOZ1BSJqsh4hDrTnISnRms2USxTXyjrJncnaZH/1B3Jc998qP+VDtI3Sfo0I8cp19S0aXBW45Okt8IqBWY7B4tFVpwkqw3Gijlma1TXHgFC05gkA45WNiiv2sw5zhxTn0PCAadqMVvM6XWi+iaobVdVbtqgfr9Uv8o1PZnVHJ7KkkhJY3rRmSVfJJ1ZsqKk0zIQrst6q0gKicnD2A/kPRqoaZeoyjyWzhnNKHIyFOSorzh2FAiAtavC+LRZn6rToNBBBqRKOjXKyRy3NaMMpCvMKszCycZlhQJRt0XVGVpmeU7WB+nG5RBQRYVZkIWTtUEyIQn2bGNgzxp26+oDd509bRwxwiQEOheZqqP+3cA0GGA6zkrMZobKJGPvjux5uu7iE2FCgHhtgFjSvPaFa/eODL7+hqTZ1IbmWOFhpvK8eqGw6heb0/E7O1CNbst0NHSFppWLXR13R1I1C7x9XV0iDia8wdeP//jBR59nV8KkJ0MiqqlXK+BVq1WzYmk6s+9jBrMpZ8UMiTKjmBbjGdIF7axmMNl7rFRyGM+QTl10RUzxDSYqgQg0URe0NaNkem2L8mnRrlmEkDVwkxjcISIv8eahv6ZdJZS6FsowuP+czvg4eIeqWVR/92tP7k9OOBAkyUMYFQVwrOTnmDPDTSs5dsgo58dtE+2WTFMddKX2Tgh1W1OTjq0mVbdPSEgAHuzfN7Jv5+7PxPcrs1XqaLNVk7Nhq1rQNVVxRHAqJc2guiJiXfH4Y8gfyzuWrvH8p5TTyhR68mlaKZxJoDvLlvRp0VbQ40eU61FZMMm8aRevT1nSIKgfuCGhoLlL6S6sJAwSZJHuJllimqHxLBhXd4YTiUQcWG1tDnbEs4ZrB8mJxnD5bNPk9XnaW0sIPDWmnIlbVg29on8+FAKHHVLNIitQB7zfjcTRcR3A5oipF5mdV/WzFzPklovPiGiMoj0dQAHhbyGIoM1B7G3kPVcdPXTtxfxbMpKR13VHTmKelmIZsfY6g3q9aOYEoH8C0H8pVEukFzMviJCMOMLYdYlR9CvdBEk1EgqJta0RzCIQIYxmAJ4BgXvjuVP3f/6JbR2AANZ8JwYCkMaCeOSjeAZaFEAmr/Y9/v4/Xjp/xvSRCRbSApitnAh424KGsk2VFSGh+OJ3KPTV/MUzsTCCdRTyCKcQ6QDKg8E5moAv5SURNMWKLFlZMu0K1XHIQ/4ePm2b836PcIBVor0aDNCFSHCgBRrI724yaFjGs5tcScFYiAM2iCw0HE8pfFpzEiJElANiNNUQBOglgZ0RifdAznr2t29f3iNKEi9H9zUk8xzjqYa8gML6RAZY7TvdCZsxoPv90+PfeOrq41PC44Bie7sJY/hEe1Ows2l/9Y3Zd/74hwu/CvteyklE2qFW3zhxRYIbh6PbLZzpdl8XyCk6bAKo6sQmjIpZ1EoaLegMQ+LffbftevUvZ/ulX+vQI73EJiPXF+D3bxglj7710D8HhZiQijWNby+fTCbKW3zJB22bLqAetS//csszP6HPQnxDmnO0R5jIXCE3SlGpNZx8omm/sXOD2MvdgmCneO5COwg2Isb24mOrNNwm0Y+labCeOIyFmR+Pk8mlb21M331FQl89HlGG0gb6TtIGqNj9fOXv4W2RH4VJ1yTpFzUhNfhJqlfRIyahqnPSbmcWVtQ43lyhyfyQquPN5iAWNEwbRAIfcqGN1NjuCQS/cJndcHfD/bL7/hInRz/GoLY+XnG1ELFQ/bvEImLi+Ul87HC3XC7uf3CF4P4v3tiPHRLZBlqRjZOvCKRwIPpY7MZRreQr6h8SvF73JXbSYWrV1vhC8mABEgRVfQh1cW/vzl17wFJi1zxn7xdhgvxucSEG1nPSizyWTjmivYtl+NzXvLF74Y7C/Wf3/QqO3i2sd49nxvvxcS/H8l7WQfh9eFmRn4W7B9pD8k0utxE55oqM1gumD5eJaq6E9kn3vbWNzHFPTa+yWlbkKhS5qTWfvXDT5LO2ZZ3MXyJTpTBBuevOtffyMCddrhwOYY+ShBuMwpeQgR97hHlq7SV0YPMOjpUUltz49aAU0YCTEEw22bLcaU2cNC88dm6xeOw7u+SZaqD5BHTIqFa+9+v//Czx9KU329SBEffs7U+I1djWln8GY+Ik6+PrpStb7kzPvFeWcw4F9AtSf3ds6c37blefDJOOOpC2HJ+bmVLN8NljMwhs40QTiA41V1CDLR7XMXTTeFzjGUTiicwsTYcOrJum2BzVh2XRVLWKoLIYhNqp/QHGgzX5JWgnYOPlJzdFhyuuzHgO0XUYTjYfQZjNKBwrxk1YyMJ1JFqebR33YBYwuewFbm+7b1SluoTGNVr13uH4R1vaPIzc/EuLx1MjSoN7UFVljiO1Bv9o8ZkE1DUld1GCVwaRIEydyjWW4QKg8DF8A8WtBsXt8rVe5UPGxL+RMicrG7zeS7UDrcHRPtnWoLJtfxQRkAv4tanNodr9daamf8guvHd0ZO0yB+r1LT8zXb4XF/u6b12c+I04HdZ/i0XhDFKq6npjpdfQjlg2K2li6VFZ90mDwxK6vSXg94LINBvwMSsINlRt/Lu69LdbP4h0n7gkjiFgROWxfz339c53phZ/PqX2nPz+B/ls5U/vvn1tbPs9Rz797Z/+4HL4/9CcSKL1FQAA";
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
                        fabric.worker.transaction.TransactionManager $tm47 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled50 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff48 = 1;
                        boolean $doBackoff49 = true;
                        $label43: for (boolean $commit44 = false; !$commit44;
                                       ) {
                            if ($backoffEnabled50) {
                                if ($doBackoff49) {
                                    if ($backoff48 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff48);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e45) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff48 < 5000) $backoff48 *= 2;
                                }
                                $doBackoff49 = $backoff48 <= 32 ||
                                                 !$doBackoff49;
                            }
                            $commit44 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e45) {
                                $commit44 = false;
                                continue $label43;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e45) {
                                $commit44 = false;
                                fabric.common.TransactionID $currentTid46 =
                                  $tm47.getCurrentTid();
                                if ($e45.tid.isDescendantOf($currentTid46))
                                    continue $label43;
                                if ($currentTid46.parent != null) throw $e45;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e45) {
                                $commit44 = false;
                                if ($tm47.checkForStaleObjects())
                                    continue $label43;
                                throw new fabric.worker.AbortException($e45);
                            }
                            finally {
                                if ($commit44) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e45) {
                                        $commit44 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e45) {
                                        $commit44 = false;
                                        fabric.common.TransactionID
                                          $currentTid46 = $tm47.getCurrentTid();
                                        if ($currentTid46 != null) {
                                            if ($e45.tid.equals(
                                                           $currentTid46) ||
                                                  !$e45.tid.isDescendantOf(
                                                              $currentTid46)) {
                                                throw $e45;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit44) {
                                    {  }
                                    continue $label43;
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
      "nU1zt5zmbjVMsxr/EDb6eJl84kyo1ef6yVc/eX6qrH1v1fV9F2JNtfLl+/Nvd4GievH+5mdff8Pg/3r96knAagnYBiT8kmduTO9S2Oqj913QYatrI+fRp2988/k25f7+6vAa/yOXZr7c+m+yb/3m4OP6T12tPXIWZrrvrsq9ne7cG1x6IjGzPAmm94SYjs549XjJA0BL7b3g4YHnu8sgyQVeXYjGXGJzpSqPnXS5e/JcXmbzedDvWsWla2e6eCGpJvnRhwQJf6xMtlntqXsBd05bdu+Kzug7V+lvf8+o9AHlR5vQNo5KdNuBnd26ffTpo1fMjerderBOfVr1tVePPnkUmNu3Ufuqxa3j4+Pbt+98Sjp6tbQCF4R3WeGulFl3d6/WPHaZb2XtZ6PoIaL53EPq/mKZfCarPX66zKrV7CTqVT4WWe1ayYhLQnyqHOL5+4T4yE98rwjxEHs9OjHPWhh6phpU0jzVw9C69UoVmD06+KBKPFVo8pA7DaAffp0Rf5BzOVD04tHD+h+iz4fm4af6AD+2dXQrPPokwEjuebePDooPenupeeeBoXsGsMablfFDVdfNNKXWpu7eeifknvU8/MzCquDWIbh8KFuZ2eHnrdtlnikv70jlxZJbt198Ryy5NEdiqoaZCCHg9/5PNlF0dlPh8Psybs6GOxXhO6X0bISLHInOSm/d/pOtGIwxDDJzVfUPq7Lbdw5Cts9AdlTCtDQe5fNIBxbiVlUS3jkHwMNubVTiN+Mc2CSA+2wa3tKPH+ByX6wQefvOq/eg6jvZmKvndwVOrsbcayuunrdqnu4wnr1I7wHkD7lZ8vpDrM9fLZPXgNO4Vy0fZIMeO9Hgi2bo9KrUB0/Nz2lBWXvzu7fwMvli1erNhyzmb5TJz4P92UE4aXavhB7kCavN7bP3GdFrzveKET2xngchH1UOolKBtPKG1VW0m3lkAAKrYoDt/wPbdBgOaPd3zQg9fMT/16zNFtR87y/t9p0TXBw81oHc/w+M/0tu6FgPA+tkkUASlcYKapJVFy3TsujEPZQcuHPfFvRtjmn3bTi//NAN51ceUvd3yuQXs9q7LhiTyr4+yDQ+c59pvHL9e8w0VmeE+9h8dlSo/h1wfF/97TsvHn2no8TxAQk3SxDcPFjgm7cefHJ4p2L7uw8V299/SN2vlskvZ7WnLy2lLP7CDhwRSvrLy6s/8ICb6yf/o9CpXzff/P3xi+9/m1vrH7zvny0n/b7yxtOPf98bs39d3cw++4/EDab2uAX20RfvaV7IX48S07Ir4m8cbm0eWPYPwWHnlOvl769VR+Hnzn38c3lS/tXmrf/8fX90/fHpN07uJdaOPvvff+Enr/3OK2/8s1f0J+Rf/aO7jP8ffu+3v81+7Afp5s//01/7w6v/G4QwQssCNAAA";
}
