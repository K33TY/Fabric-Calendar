package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;

public interface AttendeeEvent extends fabric.lang.Object {
    public calendar.event.AttendeeEvent calendar$event$AttendeeEvent$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511009306000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static interface calendar$event$AttendeeEvent$_split_0
      extends fabric.lang.Object {
        public long get$onum();
        
        public long set$onum(long val);
        
        public long postInc$onum();
        
        public long postDec$onum();
        
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public java.lang.String get$note();
        
        public java.lang.String set$note(java.lang.String val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.AttendeeEvent get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$AttendeeEvent$_split_0 {
            public long get$onum() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  get$onum();
            }
            
            public long set$onum(long val) {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  set$onum(val);
            }
            
            public long postInc$onum() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  postInc$onum();
            }
            
            public long postDec$onum() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  postDec$onum();
            }
            
            public java.lang.String get$name() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  set$name(val);
            }
            
            public java.lang.String get$note() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  get$note();
            }
            
            public java.lang.String set$note(java.lang.String val) {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  set$note(val);
            }
            
            public calendar.event.AttendeeEvent get$$root() {
                return ((calendar.event.AttendeeEvent.
                          calendar$event$AttendeeEvent$_split_0._Impl) fetch()).
                  get$$root();
            }
            
            public _Proxy(calendar$event$AttendeeEvent$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$AttendeeEvent$_split_0 {
            public long get$onum() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.onum;
            }
            
            public long set$onum(long val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.onum = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public long postInc$onum() {
                long tmp = this.get$onum();
                this.set$onum((long) (tmp + 1));
                return tmp;
            }
            
            public long postDec$onum() {
                long tmp = this.get$onum();
                this.set$onum((long) (tmp - 1));
                return tmp;
            }
            
            long onum;
            
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
            
            public java.lang.String get$note() {
                fabric.worker.transaction.TransactionManager.getInstance().
                  registerRead(this);
                return this.note;
            }
            
            public java.lang.String set$note(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.note = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String note;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       fabric.lang.security.LabelUtil._Impl.noComponents());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$AttendeeEvent$_split_0) this.$getProxy();
            }
            
            public calendar.event.AttendeeEvent get$$root() {
                return this.$root;
            }
            
            private calendar.event.AttendeeEvent $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.AttendeeEvent root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.AttendeeEvent.
                         calendar$event$AttendeeEvent$_split_0._Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                out.writeLong(this.onum);
                $writeInline(out, this.name);
                $writeInline(out, this.note);
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
                this.onum = in.readLong();
                this.name = (java.lang.String) in.readObject();
                this.note = (java.lang.String) in.readObject();
                this.$root =
                  (calendar.event.AttendeeEvent)
                    $readRef(calendar.event.AttendeeEvent._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.
                  event.
                  AttendeeEvent.
                  calendar$event$AttendeeEvent$_split_0.
                  _Impl
                  src =
                  (calendar.event.AttendeeEvent.
                    calendar$event$AttendeeEvent$_split_0._Impl) other;
                this.onum = src.onum;
                this.name = src.name;
                this.note = src.note;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.AttendeeEvent.
                           calendar$event$AttendeeEvent$_split_0._Static
            {
                public _Proxy(calendar.event.AttendeeEvent.
                                calendar$event$AttendeeEvent$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.AttendeeEvent.
                  calendar$event$AttendeeEvent$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      AttendeeEvent.
                      calendar$event$AttendeeEvent$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        AttendeeEvent.
                        calendar$event$AttendeeEvent$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.AttendeeEvent.
                            calendar$event$AttendeeEvent$_split_0._Static.
                            _Impl.class);
                    $instance =
                      (calendar.event.AttendeeEvent.
                        calendar$event$AttendeeEvent$_split_0._Static)
                        impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.AttendeeEvent.
                           calendar$event$AttendeeEvent$_split_0._Static
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
                    return new calendar.event.AttendeeEvent.
                             calendar$event$AttendeeEvent$_split_0._Static.
                             _Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { -35, -77, -126, -4,
        100, -53, -58, 93, 6, -77, 66, 94, -52, -23, -123, -108, 64, 19, 25,
        108, 95, 95, -61, 75, 50, 94, 11, 115, 84, 57, -41, -54 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511009306000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "H4sIAAAAAAAAANVYXWxcRxWeXTvr39iO89M4P85Nsm3t1NklsRSabFsSL06zzZpYsV2ELWeZvTtr33j23pt7Z511g9tS1CbqQ4SCG1qJ+skI2ppWoqp4qCJVopSWVAgQoiBUiCpVtAp5qFCBh0I5Z+bu/9r4AR6y0p2dO3PmzJnz850zd/kWWec6ZE+aJg0eEnM2c0PHaTIWH6aOy1JRTl13FEYTekt97OpHP0h1+4k/Tlp1alqmoVOeMF1B2uJn6SwNm0yEx07HIhOkSceFJ6g7LYh/YiDnEM22+NwUt4S3SRX/Z+4JL3z3TMeP60j7OGk3zBFBhaFHLVOwnBgnrRmWSTLHPZZKsdQ42WAylhphjkG58QgQWuY46XSNKZOKrMPc08y1+CwSdrpZmzlyz/wgim+B2E5WF5YD4nco8bPC4OG44YpInATSBuMp9xx5lNTHybo0p1NAuCWeP0VYcgwfx3EgbzZATCdNdZZfUj9jmClBdlWuKJw4eBIIYGlDholpq7BVvUlhgHQqkTg1p8IjwjHMKSBdZ2VhF0G2rcgUiBptqs/QKZYQZGsl3bCaAqomqRZcIsjmSjLJCWy2rcJmJda69ZX7Ll8wT5h+4gOZU0znKH8jLOquWHSapZnDTJ2pha374lfplmuX/IQA8eYKYkXzk298crSv+423Fc32GjSnkmeZLhL6UrLt1zuivYfrUIxG23INdIWyk0urDnszkZwN3r6lwBEnQ/nJN06/9bXHX2Q3/aQ5RgK6xbMZ8KoNupWxDc6cB5nJHCpYKkaamJmKyvkYaYB+3DCZGj2VTrtMxEg9l0MBS76DitLAAlXUAH3DTFv5vk3FtOznbELIJnhIEB4fUT/5L3yfRj0htIIUWs8HTy998NSV85Yzw5ygDT6iGzblR1YmPRIecyGEwoMYM0lwu/CXmTsjLDs8NGhOJYYdC7UajlIOJ6HOfgACx9DDrqOHdW8sPEQNMwRoceSLh/v6+/cfOtjbe0Q7l6WucS5rCdZjZ5Pc0DVXRq+WNkzKNQkGWp5FkM0yUwSPCQGvjA3Kt4Rrc0MkvqBd0Ca4ZU5plpnN9GkYBBdoJjkfwkhQPRUOsq9hsKyBCgTr0zzJ0vJQleTKoRR50DANEQcFcbcnFAr1wlLHmAVF5o/jHUStlKdR3bIjebwcyxKFvdekArnn5JA232vbOXSNjvM+H3jtLt1KsSR1IQS8cBwY5oA4JyyeYk5C55evxcjGa8/JkGxCzbgABdLpfBBGOyoBuHTtQnZg8JOXE9dVOONazycFGcgLrU5afsjgmk4EwreijUKQIEKQIJZ9uVB0MfaSjNqAKy1V2K8JnYtbwDhHfD558k1ysYxViLQZQHAA6dbekcmHvn5pTx2AhH2+HmMFSIOVkFUE+hj0KOBQQm+/+NHfX7k6bxXBS5BgFaZWr0RM3FOpRsfSWQpyTpH9Po2+lrg2H/QjnjdBqhEQM4jb3ZV7lGFjJJ9nUBXr4qQlbTkZynEqnxyaxbRjnS+OSPdok/0NoIAGBIt4NXp03W7osbY4Wc0xNYy7XkATmed6eiOamDbckAxH7X45GymJMHSyCsPK1H7/iP3873/5cb8sevJVQHtJuTDCRKQk8yCzdpljNhR9dtRhDOjef3b4O8/cujghHRYo9tbaMIgt2oCC7i3nybfP/eHPf1r6rb/o5IIElJZyBbvLX6DS7ji718ad7irKAlmLg5VAVDc4ZmaslJE2aJIzjKjP2u888NpfL3eosOAwopzMIX3/nUFxvGuAPH79zD+6JRufjlVTUV9FMpWKNxY5H3McOody5L75m53P/Zw+D/AAidQ1HmEyN/q8IEehNgmyYzXzI02XNO1BSb9ftgdQLZILkXOHsNmt9Lhdjte71QXMcawEi9E9Hl7+3rboAzcVzBaiG3loNWD2YVoCPAdfzHzq3xP4mZ80jJMOWYRSUzxMeRYdZBzKSDfqDcbJ+rL58pJQpatIAb12VCJLybaVuFKEd+gjNfabK6BEelALPI3wfNv7f0qQ8f8BCEh7hcvshZhg/1+553zExsPdJ48YlO3d2OzzHEId/XP4+eD5Nz44jgMSRUlnNTQK8i0JKy6EKguuHSPTRbmLd5b8qPcn7ewyPesYYi58LAnJiOpiOA/UEkXv7Tu0/0A/KK4ey6UavgvkGQCmWa/4ZpcWnv48dHlBRbi6oeytuiSUrlG3FOkc67EZyMEuu1fbRa44/pdX5l//4fxFVcF3ltfbgyDrj373r3dDz954p0bBUY/1n0JlbO8t98n18DTBs+j9X8HZB6Rpv5S38RA2R4Xim8eLDok0qFWvNpQTWwVpRU3anArMt7lVN26F51fe/5s1Nh4tbAzJDPvDtdi1Ibt9VWma/PH2SdM16+GaeVhm3AgmWk9HX60dgH5BGjy2AvAKGUtbDMCb5IEv/VKdudoc6rB7j8CCEu8e+DapWJQAPEH/3bnSvVb67tITC4upU98/4PeyxEPA0vv4UOSDtebuqo8mQ/IqX8T7Gzd3Ho7OfDilwmBXxbaV1C8MLb/z4F36FT+pKwB71feD8kWRcjhvdhhAiTlaBuq7yuvD7ur68LHbx/FK73AqmFUqLLu0Yd03wWYp71FFX9ZOgaByEmq/2hfAPNKqN0k7BmClXk0Lj22Z4NDAvTfSp5Vwp7rOXHfYAsHmgH3VliHI42k1rdYqI0nCyORIaRUq/RqbnjXUdhxqu5Vrm9XmZLFyVpCWEqXlYbKzWre1gTInyJ1rqtNl4EK4bK9xf/U+VenRN9nShyf7Nq9wd91a9fHQW/fyYnvjHYtj78mrVuEzVBNU5Oks56WFTkk/YDssbUhNNKmyR+n/giBt5VgG2CP/pQbmFNWjgjTmqfD9MYlqXYVGSKqurIMfPpf/dsc/A42jN2T9DurX3n/1ic9S19+aDLw6cObdj59cOLqxiycSPz158EyLO3r4vV/8B4xPgbKQFQAA";
    }
    
    public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
      get$calendar$event$AttendeeEvent$_split_0();
    
    public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
      set$calendar$event$AttendeeEvent$_split_0(
      calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0 val);
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.AttendeeEvent {
        public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
          get$calendar$event$AttendeeEvent$_split_0() {
            return ((calendar.event.AttendeeEvent._Impl) fetch()).
              get$calendar$event$AttendeeEvent$_split_0();
        }
        
        public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
          set$calendar$event$AttendeeEvent$_split_0(
          calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0 val) {
            return ((calendar.event.AttendeeEvent._Impl) fetch()).
              set$calendar$event$AttendeeEvent$_split_0(val);
        }
        
        public calendar.event.AttendeeEvent calendar$event$AttendeeEvent$() {
            return ((calendar.event.AttendeeEvent) fetch()).
              calendar$event$AttendeeEvent$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.event.AttendeeEvent) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.event.AttendeeEvent._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.event.AttendeeEvent
          jif$cast$calendar_event_AttendeeEvent(fabric.lang.Object arg1) {
            return calendar.event.AttendeeEvent._Impl.
              jif$cast$calendar_event_AttendeeEvent(arg1);
        }
        
        public _Proxy(AttendeeEvent._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public abstract static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.AttendeeEvent {
        public calendar.event.AttendeeEvent calendar$event$AttendeeEvent$() {
            ((calendar.event.AttendeeEvent._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.event.AttendeeEvent) this.$getProxy();
        }
        
        public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
          get$calendar$event$AttendeeEvent$_split_0() {
            return this.calendar$event$AttendeeEvent$_split_0;
        }
        
        public calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0
          set$calendar$event$AttendeeEvent$_split_0(
          calendar.event.AttendeeEvent.calendar$event$AttendeeEvent$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$AttendeeEvent$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$AttendeeEvent$_split_0
          calendar$event$AttendeeEvent$_split_0;
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.calendar$event$AttendeeEvent$();
        }
        
        private void jif$init() {
            this.
              set$calendar$event$AttendeeEvent$_split_0(
                (calendar$event$AttendeeEvent$_split_0)
                  new calendar.event.AttendeeEvent.
                    calendar$event$AttendeeEvent$_split_0._Impl(
                    this.$getStore(),
                    (calendar.event.AttendeeEvent) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(fabric.lang.security.LabelUtil._Impl.noComponents(),
                          o);
            return fabric.lang.Object._Proxy.
              $getProxy(
                (java.lang.Object)
                  fabric.lang.WrappedJavaInlineable.
                  $unwrap(o)) instanceof calendar.event.AttendeeEvent;
        }
        
        public static calendar.event.AttendeeEvent
          jif$cast$calendar_event_AttendeeEvent(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.AttendeeEvent._Impl.jif$Instanceof(o))
                return (calendar.event.AttendeeEvent)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   fabric.lang.security.LabelUtil._Impl.noComponents());
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.event.AttendeeEvent) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$AttendeeEvent$_split_0().
              fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.AttendeeEvent._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$AttendeeEvent$_split_0,
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
            this.calendar$event$AttendeeEvent$_split_0 =
              (calendar.
                event.
                AttendeeEvent.
                calendar$event$AttendeeEvent$_split_0)
                $readRef(
                  calendar.event.AttendeeEvent.
                    calendar$event$AttendeeEvent$_split_0._Proxy.class,
                  (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                  intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.AttendeeEvent._Impl src =
              (calendar.event.AttendeeEvent._Impl) other;
            this.calendar$event$AttendeeEvent$_split_0 =
              src.calendar$event$AttendeeEvent$_split_0;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.AttendeeEvent._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.AttendeeEvent._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.AttendeeEvent._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.AttendeeEvent._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.AttendeeEvent._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.event.AttendeeEvent._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.AttendeeEvent._Static $instance;
            
            static {
                calendar.
                  event.
                  AttendeeEvent.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.AttendeeEvent._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.AttendeeEvent._Static._Impl.class);
                $instance = (calendar.event.AttendeeEvent._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.AttendeeEvent._Static {
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
                return new calendar.event.AttendeeEvent._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { -35, -77, -126, -4,
    100, -53, -58, 93, 6, -77, 66, 94, -52, -23, -123, -108, 64, 19, 25, 108,
    95, 95, -61, 75, 50, 94, 11, 115, 84, 57, -41, -54 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511009306000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
    public static final java.lang.String jlc$ClassType$fabil$1 = "AA==";
}
