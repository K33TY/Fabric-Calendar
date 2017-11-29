package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;

public interface OwnerEvent extends fabric.lang.Object {
    public calendar.event.OwnerEvent calendar$event$OwnerEvent$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511914328000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$OwnerEvent$_split_0
      extends fabric.lang.Object {
        public fabric.lang.security.Label get$lbl();
        
        public fabric.lang.security.Label set$lbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.OwnerEvent get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$OwnerEvent$_split_0 {
            public fabric.lang.security.Label get$lbl() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$lbl();
            }
            
            public fabric.lang.security.Label set$lbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  set$lbl(val);
            }
            
            public calendar.event.OwnerEvent get$$root() {
                return ((calendar.event.OwnerEvent.
                          calendar$event$OwnerEvent$_split_0._Impl) fetch()).
                  get$$root();
            }
            
            public _Proxy(calendar$event$OwnerEvent$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$OwnerEvent$_split_0 {
            public fabric.lang.security.Label get$lbl() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.lbl;
            }
            
            public fabric.lang.security.Label set$lbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.lbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label lbl;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       fabric.lang.security.LabelUtil._Impl.noComponents());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$OwnerEvent$_split_0) this.$getProxy();
            }
            
            public calendar.event.OwnerEvent get$$root() { return this.$root; }
            
            private calendar.event.OwnerEvent $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.OwnerEvent root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.OwnerEvent.
                         calendar$event$OwnerEvent$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.lbl, refTypes, out, intraStoreRefs,
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
                this.lbl = (fabric.lang.security.Label)
                             $readRef(fabric.lang.security.Label._Proxy.class,
                                      (fabric.common.RefTypeEnum)
                                        refTypes.next(), in, store,
                                      intraStoreRefs, interStoreRefs);
                this.$root = (calendar.event.OwnerEvent)
                               $readRef(calendar.event.OwnerEvent._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.
                  event.
                  OwnerEvent.
                  calendar$event$OwnerEvent$_split_0.
                  _Impl
                  src =
                  (calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0.
                    _Impl) other;
                this.lbl = src.lbl;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.OwnerEvent.
                           calendar$event$OwnerEvent$_split_0._Static
            {
                public _Proxy(calendar.event.OwnerEvent.
                                calendar$event$OwnerEvent$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.OwnerEvent.
                  calendar$event$OwnerEvent$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      OwnerEvent.
                      calendar$event$OwnerEvent$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        OwnerEvent.
                        calendar$event$OwnerEvent$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.OwnerEvent.
                            calendar$event$OwnerEvent$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (calendar.event.OwnerEvent.
                        calendar$event$OwnerEvent$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.OwnerEvent.
                           calendar$event$OwnerEvent$_split_0._Static
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
                    return new calendar.event.OwnerEvent.
                             calendar$event$OwnerEvent$_split_0._Static._Proxy(
                             this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { -38, 82, 39, -87,
        28, -6, -89, -35, 16, 125, 118, 66, -116, -84, -55, 74, -46, -19, 29,
        -21, -41, 92, 21, 105, -72, 97, -95, -101, 58, 35, 103, 40 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511914328000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "H4sIAAAAAAAAANVYa2xcRxWeXTvrR4ztOI/GeTi3ztJ4U2cviaWQeFNEvDjNpmuysuMibJLt7L2z61vP3ntzZ9ZeNxgKCFohlB8lDa2gkZCMqhZTJKQK/kTqDx6NipCoEC1IhahSpaKQHxXiIcTrzMzdvfsyyQ/4kZXu3Lkz55w5c+ac75zZ9dtoE/PQcB7nLBrnKy5h8VM4l0pnsMeImaSYsXMwmjU2t6euvv+iORRG4TTqMbDt2JaBadZmHPWmH8dLWLcJ12enU4l51GUIxtOYLXAUnp8oe0hzHbpSoA73F2mS/+yD+pVvXOj/QRvqm0N9lj3DMbeMpGNzUuZzqKdIijnisZOmScw5tMUmxJwhnoWp9QQQOvYcGmBWwca85BE2TZhDlwThACu5xJNrVgaF+g6o7ZUM7nigfr9Sv8QtqqctxhNpFMlbhJrsIvocak+jTXmKC0C4I13ZhS4l6qfEOJB3W6Cml8cGqbC0L1q2ydG+Ro7qjqOPAAGwdhQJX3CqS7XbGAbQgFKJYrugz3DPsgtAuskpwSoc7dpQKBB1uthYxAWS5WhnI11GTQFVlzSLYOFoeyOZlARntqvhzGpO6/YnT1y+ZJ+2wygEOpvEoEL/TmAaamCaJnniEdsgirHnYPoq3nH96TBCQLy9gVjR/PCzH3x8dOi11xXN7hY0Z3OPE4NnjbVc7y/3JGPH24Qana7DLOEKdTuXp5rxZxJlF7x9R1WimIxXJl+b/umnn3yZ3Aqj7hSKGA4tFcGrthhO0bUo8R4mNvEwJ2YKdRHbTMr5FOqAftqyiRo9m88zwlOoncqhiCO/wUR5ECFM1AF9y847lb6L+YLsl12E0DZ4UBSeEFI/+eahG0lfCa2qhTby7lfX3v3KM8uOt0i8qAs+YlgupuMbk47rswxCSJ8UMZMDt9M/Qdgid1x9atIuZDOeI6yqJzGFnWDvEACBZxk68wzd8Mf0KWzZcUCL8Y8eHx0bO3T0SCw2rl0sYWZdLDmcjLilHLUMjcno1fKWjakmwUCriIiSJWLz6Nll0G5SdrPMpRbPfkS7pM3n5ZqXcDG3Ghfer3qMGCXP4ivqKw3KU9nVaI6Oav6arVmVqyjqqGVbXHKzkXg8HgNWz1oCE1UU9VVUnFJPX0hVWV+Q5zi8uvCddyZXOz+lrcZctyyOu385FAJP3Gc4JslhBm7th9hEhgKKnHaoSbysQS9fT6Gt15+XYdYloIFBeEtHCkFo7GkE1VreK6WJyQ9eyb6hQlTw+n7G0YmKxmqPNduL3nkvoHaPAKc4wH0c4H49VI4nr6W+K2MwwiRYVVfqEq5CHZBaRqGQ3PM2ySwjD+JmEfAYILcnNnP+zGNPD7dByLvL7cLzgTTaCEABbKeghwFVskbfU+//5ftXV50AijiKNiFkM6dAuOFGA3qOQUzIIIH4gxp+NXt9NRoW6NwFiYNDBAgUHmpcow7pEpWsIUyxKY025x2viKmYqkB9N1/wnOVgRDpGr+xvAQN0iNBPNWPB1nsNC+4iPDb0R00EWgyAQearkVhC4wsWi8v40x6Ss4maqBLu1XCkMkU/NOO+8PYv/jAmi5dKNu+rSfszhCdqMogQ1idzxZbAW895hADdO89lvv7s7afmpasCxf5WC0ZFK6yPweqO9+XXL/7m979b+1U4cG+OIso+5eqJy1+k8cTF7H5XrPRAoAtkHwrnA6qy6KxddEwrb+EcJSKW/tH34cOv/vFyvwoICiPKvTw0emcBwfjgBHryjQt/HZJiQoaofgJ7BWQqpW4NJJ/0PLwi9Ch/4c29z/8MvwDAAAmRWU8QmeNCfngLpbZxNLjh2QuCQXmuRyTxIdkeFjaRIpCcOyqa+5URd8vxMGuuQk6Jci4I6jl9/Vu7kh+7pXC1GtRChtYCVx/FNXhz5OXin8PDkZ+EUccc6peVJLb5o5iWhHfMQS3Ikv5gGn2obr6+rlOZKVEFrT2NgFKzbCOcBHgOfUEt+t0NCCKN1AtPH9h7wn8f4+hT/4PYl4elB4clcMD9/4kuh5ArtnVCbi4q2wOiOei7gtr0v+EXgudf4hHjYkDCJhpoxkKOviTRhEGEkujdg2I+UDq4clRG/Zc84UrZop/MQfbBBs9UkFnC5rHRo4cOj4HV2qCMqcTDLiVAVjDVukeVPJJkJ0c9gtmlmIuc4gOfaI9VT14cOjrQlDvQ2/dO7mhZmDXnB5kJEiIB+B5yprWHhDnq8GVyCCUhVVpuAr6kDPExJm1Zbi2hTXQf5KLEEbWt+MooETXYA47oob0b3ZvknW/ti1eumWe/c1jdbgbq7yKTdqn4vV//8+fx527eaFG4RfxbcLCgKJPub7q9T8k7ZYBZN2/tPZ5cfK+g1tzXoF8j9UtT6zcefsB4JozaquDUdJGtZ0rUQ1K3RyAo7HN1wLSvvrQZai5tPn/vuGftlUPFqoLzujuGKFzmyRKmI6pqKbkmKConoXi566vOLHiG+rQdsW3HBs8H6bHEqFYjHRsGYSzjgGIrIL5pyTjkoryaVrzqkCRh4vxMbRklA0A0I3dRnDwGxcnG+dn8L3N50VzgaHON0So4ONBs29b4V+Zo+M4lpgxviJXdLW5c/h8mRvLHZO29R0a3b3Db2tn0F5bP98q1vs77rs2+Ja8I1T9DuqCezJcorc3UNf2I65G8Jc3QpfK2Mr7DUW893AFCybfcflFRwf2js0IlvpnEvsFqsyCpBkue+Ptt/U/3/S3See6mrD7B9tpvpw+8tOfvL77Tv7o08bX1G2fevL331luf2W79CH/7m+P7CyP/AX1iMq8WFAAA";
    }
    
    public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
      get$calendar$event$OwnerEvent$_split_0();
    
    public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
      set$calendar$event$OwnerEvent$_split_0(
      calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val);
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.OwnerEvent {
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          get$calendar$event$OwnerEvent$_split_0() {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              get$calendar$event$OwnerEvent$_split_0();
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          set$calendar$event$OwnerEvent$_split_0(
          calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val) {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              set$calendar$event$OwnerEvent$_split_0(val);
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L(
          ) {
            return ((calendar.event.OwnerEvent._Impl) fetch()).
              get$jif$calendar_event_OwnerEvent_L();
        }
        
        public calendar.event.OwnerEvent calendar$event$OwnerEvent$() {
            return ((calendar.event.OwnerEvent) fetch()).
              calendar$event$OwnerEvent$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.event.OwnerEvent) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return calendar.event.OwnerEvent._Impl.jif$Instanceof(arg1, arg2);
        }
        
        public static calendar.event.OwnerEvent
          jif$cast$calendar_event_OwnerEvent(fabric.lang.security.Label arg1,
                                             fabric.lang.Object arg2) {
            return calendar.event.OwnerEvent._Impl.
              jif$cast$calendar_event_OwnerEvent(arg1, arg2);
        }
        
        public _Proxy(OwnerEvent._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.OwnerEvent {
        public calendar.event.OwnerEvent calendar$event$OwnerEvent$() {
            ((calendar.event.OwnerEvent._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.event.OwnerEvent) this.$getProxy();
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          get$calendar$event$OwnerEvent$_split_0() {
            return this.calendar$event$OwnerEvent$_split_0;
        }
        
        public calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0
          set$calendar$event$OwnerEvent$_split_0(
          calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$OwnerEvent$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$OwnerEvent$_split_0
          calendar$event$OwnerEvent$_split_0;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L) {
            super($location);
            this.jif$calendar_event_OwnerEvent_L = jif$L;
        }
        
        public void jif$invokeDefConstructor() {
            this.calendar$event$OwnerEvent$();
        }
        
        private void jif$init() {
            this.
              set$calendar$event$OwnerEvent$_split_0(
                (calendar$event$OwnerEvent$_split_0)
                  new calendar.event.OwnerEvent.
                    calendar$event$OwnerEvent$_split_0._Impl(
                    this.$getStore(),
                    (calendar.event.OwnerEvent) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof calendar.event.OwnerEvent) {
                calendar.event.OwnerEvent c =
                  (calendar.event.OwnerEvent)
                    fabric.lang.Object._Proxy.$getProxy(o);
                return fabric.lang.security.LabelUtil._Impl.
                  equivalentTo(c.get$jif$calendar_event_OwnerEvent_L(), jif$L);
            }
            return false;
        }
        
        public static calendar.event.OwnerEvent
          jif$cast$calendar_event_OwnerEvent(
          final fabric.lang.security.Label jif$L, final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.OwnerEvent._Impl.jif$Instanceof(jif$L, o))
                return (calendar.event.OwnerEvent)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_OwnerEvent_L(
          ) {
            return this.jif$calendar_event_OwnerEvent_L;
        }
        
        private fabric.lang.security.Label jif$calendar_event_OwnerEvent_L;
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   fabric.lang.security.LabelUtil._Impl.noComponents());
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.event.OwnerEvent) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$OwnerEvent$_split_0().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.OwnerEvent._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$OwnerEvent$_split_0,
                      refTypes, out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_OwnerEvent_L,
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
            this.calendar$event$OwnerEvent$_split_0 =
              (calendar.
                event.
                OwnerEvent.
                calendar$event$OwnerEvent$_split_0)
                $readRef(
                  calendar.event.OwnerEvent.calendar$event$OwnerEvent$_split_0.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_OwnerEvent_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.OwnerEvent._Impl src =
              (calendar.event.OwnerEvent._Impl) other;
            this.calendar$event$OwnerEvent$_split_0 =
              src.calendar$event$OwnerEvent$_split_0;
            this.jif$calendar_event_OwnerEvent_L =
              src.jif$calendar_event_OwnerEvent_L;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.OwnerEvent._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.OwnerEvent._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.event.OwnerEvent._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.OwnerEvent._Static $instance;
            
            static {
                calendar.
                  event.
                  OwnerEvent.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.OwnerEvent._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.OwnerEvent._Static._Impl.class);
                $instance = (calendar.event.OwnerEvent._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.OwnerEvent._Static {
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
                return new calendar.event.OwnerEvent._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm63 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled66 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff64 = 1;
                        boolean $doBackoff65 = true;
                        $label59: for (boolean $commit60 = false; !$commit60;
                                       ) {
                            if ($backoffEnabled66) {
                                if ($doBackoff65) {
                                    if ($backoff64 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff64);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e61) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff64 < 5000) $backoff64 *= 2;
                                }
                                $doBackoff65 = $backoff64 <= 32 ||
                                                 !$doBackoff65;
                            }
                            $commit60 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e61) {
                                $commit60 = false;
                                continue $label59;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e61) {
                                $commit60 = false;
                                fabric.common.TransactionID $currentTid62 =
                                  $tm63.getCurrentTid();
                                if ($e61.tid.isDescendantOf($currentTid62))
                                    continue $label59;
                                if ($currentTid62.parent != null) throw $e61;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e61) {
                                $commit60 = false;
                                if ($tm63.checkForStaleObjects())
                                    continue $label59;
                                throw new fabric.worker.AbortException($e61);
                            }
                            finally {
                                if ($commit60) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e61) {
                                        $commit60 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e61) {
                                        $commit60 = false;
                                        fabric.common.TransactionID
                                          $currentTid62 = $tm63.getCurrentTid();
                                        if ($currentTid62 != null) {
                                            if ($e61.tid.equals(
                                                           $currentTid62) ||
                                                  !$e61.tid.isDescendantOf(
                                                              $currentTid62)) {
                                                throw $e61;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit60) {
                                    {  }
                                    continue $label59;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { -38, 82, 39, -87, 28,
    -6, -89, -35, 16, 125, 118, 66, -116, -84, -55, 74, -46, -19, 29, -21, -41,
    92, 21, 105, -72, 97, -95, -101, 58, 35, 103, 40 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511914328000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "/X8AfULsb6wtAAA=";
}
