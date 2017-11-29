package calendar.event;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import fabric.lang.Object;
import fabricated.util.List;
import calendar.util.Date;
import calendar.User;

public interface Event extends fabric.lang.Object {
    public calendar.event.Event calendar$event$Event$(
      final int uid_, final fabric.lang.security.Label timeLbl_,
      final fabric.lang.security.Label infoLbl_,
      final calendar.util.Date startTime_, final calendar.util.Date endTime_,
      final java.lang.String name_, final java.lang.String note_,
      final fabricated.util.List attendees_,
      final fabricated.util.List viewers_, final calendar.User creator_);
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1511993786000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    public static final java.lang.String jlc$ClassType$fabric$1 =
      "oeiKDkxi/92uxADr/xh8zy0xdkzBL+WAfgO8fj0SKzEdKSAIDOGTLpHYGa/EHnJI7Ixf1gF0ZDOY5SOxs52U2HtOiaUszgtVFhn4l8O4v43BLQ4ysOZQtpOd0IVBft9cxa/l7P/Grj3hRQfGmStNbcQ9Glp8bJQQFnU1ZQjdrI9HXcT5ECf7SKxc+1Nl/5/mjyn1+Qhn/7QP9TK8w3uK8vrtWXoKvytnfYapsEHIiySjUefXlxz3OXFdiahIeSHdIqeLAv8whEI3jwn5CFGqH9Nan8FhGlYL/v8cOYiLhENw7PCCJFuEx1cz6Gei8FHaqxkpwc15+Mc+WpBF94FwQmJvfYEccRmEWEWAWUcgPUnQ3QgFrGIJDyFOtTCjxaNc04qhlWIGXa8K0caud2PksZq9eBgOBbaXbLIK3QtHUFQAIsjqg/KYRAvwfkrcp8jhE3ry+ObJlb74R9E8zjJto9KSVnfS2wgGB7fjuixpQcVyHkKnXJeDUtG7YNmTR+PwL40zRN0CkxisyoQzUHE8D6FTSwAOStlWNoczThondjlnUKtz3N8RnadGFiTpZ85D8vvjx81+8sSI4+xjRL7vM9sYR/bMW3jdB5Pol0e7EWo24t5VzwYhlx48RCrgU6pDfVsz28qZW/mPwh/kD7c+ngmXfuzztGn+i/6Dxy5WWkESg/WWlM8GpevL7CH5vhm//uT4qrU/J9GgWehlRYPaVkVeo4R5u62eBtYIm2756daSG8jgm4V8NdGkJxMGfGQ9XzYDGdCznH6UJo4L6FmXEuJGp30/zdWy6+tpzyTj+/fnDL+KyuQr3g9EudDsXZrA6t2LGnI/v8r62gzX5wZoTgHsw83/IVRpzLWyHrhWhq4UqtQZwiBT0ypQ0ypQ0ypC+GX/0MVQ6WgHlWB6J/4WGAHbIuKfrLvnrLu2DpqAwwriAav6JriDCYV4p3VXjnepfwLpbw20JGEAAA==";
    public static interface calendar$event$Event$_split_0
      extends fabric.lang.Object {
        public int get$uid();
        
        public int set$uid(int val);
        
        public int postInc$uid();
        
        public int postDec$uid();
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_0 {
            public int get$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$uid();
            }
            
            public int set$uid(int val) {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).set$uid(val);
            }
            
            public int postInc$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postInc$uid();
            }
            
            public int postDec$uid() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).postDec$uid();
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_0.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_0._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_0 {
            public int get$uid() { return this.uid; }
            
            public int set$uid(int val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.uid = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            public int postInc$uid() {
                int tmp = this.get$uid();
                this.set$uid((int) (tmp + 1));
                return tmp;
            }
            
            public int postDec$uid() {
                int tmp = this.get$uid();
                this.set$uid((int) (tmp - 1));
                return tmp;
            }
            
            int uid;
            
            public fabric.lang.Object $initLabels() {
                this.
                  set$$updateLabel(
                    this.
                        get$$root().
                        get$jif$calendar_event_Event_L().
                        join(
                          this.
                              $getStore(),
                          fabric.lang.security.LabelUtil._Impl.
                              toLabel(
                                this.$getStore(),
                                fabric.lang.security.LabelUtil._Impl.
                                    readerPolicy(
                                      this.$getStore(),
                                      this.get$$root().
                                          get$jif$calendar_event_Event_p(),
                                      fabric.lang.security.PrincipalUtil._Impl.
                                          topPrincipal()),
                                fabric.lang.security.LabelUtil._Impl.
                                    writerPolicy(
                                      this.$getStore(),
                                      this.get$$root().
                                          get$jif$calendar_event_Event_p(),
                                      fabric.lang.security.PrincipalUtil._Impl.
                                          topPrincipal())),
                          true));
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$Event$_split_0) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_0.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                out.writeInt(this.uid);
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
                this.uid = in.readInt();
                this.$root = (calendar.event.Event)
                               $readRef(calendar.event.Event._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.event.Event.calendar$event$Event$_split_0._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_0._Impl)
                    other;
                this.uid = src.uid;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.Event.calendar$event$Event$_split_0.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_0._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_0._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_0.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_0.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_0.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_0.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_0.
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
                    return new calendar.event.Event.
                             calendar$event$Event$_split_0._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 20, -42, 39, 120,
        62, -124, -111, -9, 115, 90, -55, -57, -28, 41, -30, 92, 112, 37, -4,
        37, 70, 78, -72, 70, 47, -16, -54, 60, -51, 30, 98, -47 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511993786000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_0
      get$calendar$event$Event$_split_0();
    
    public calendar.event.Event.calendar$event$Event$_split_0
      set$calendar$event$Event$_split_0(
      calendar.event.Event.calendar$event$Event$_split_0 val);
    
    public static interface calendar$event$Event$_split_1
      extends fabric.lang.Object {
        public fabric.lang.security.Label get$timeLbl();
        
        public fabric.lang.security.Label set$timeLbl(
          fabric.lang.security.Label val);
        
        public fabric.lang.security.Label get$infoLbl();
        
        public fabric.lang.security.Label set$infoLbl(
          fabric.lang.security.Label val);
        
        public calendar.util.Date get$startTime();
        
        public calendar.util.Date set$startTime(calendar.util.Date val);
        
        public calendar.util.Date get$endTime();
        
        public calendar.util.Date set$endTime(calendar.util.Date val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_1 {
            public fabric.lang.security.Label get$timeLbl() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$timeLbl();
            }
            
            public fabric.lang.security.Label set$timeLbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$timeLbl(val);
            }
            
            public fabric.lang.security.Label get$infoLbl() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$infoLbl();
            }
            
            public fabric.lang.security.Label set$infoLbl(
              fabric.lang.security.Label val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$infoLbl(val);
            }
            
            public calendar.util.Date get$startTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$startTime();
            }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$startTime(val);
            }
            
            public calendar.util.Date get$endTime() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$endTime();
            }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).set$endTime(val);
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_1.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_1._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_1 {
            public fabric.lang.security.Label get$timeLbl() {
                return this.timeLbl;
            }
            
            public fabric.lang.security.Label set$timeLbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.timeLbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label timeLbl;
            
            public fabric.lang.security.Label get$infoLbl() {
                return this.infoLbl;
            }
            
            public fabric.lang.security.Label set$infoLbl(
              fabric.lang.security.Label val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.infoLbl = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabric.lang.security.Label infoLbl;
            
            public calendar.util.Date get$startTime() { return this.startTime; }
            
            public calendar.util.Date set$startTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.startTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date startTime;
            
            public calendar.util.Date get$endTime() { return this.endTime; }
            
            public calendar.util.Date set$endTime(calendar.util.Date val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.endTime = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.util.Date endTime;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       this.get$$root().get$jif$calendar_event_Event_L());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$Event$_split_1) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_1.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.timeLbl, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.infoLbl, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.startTime, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.endTime, refTypes, out,
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
                this.timeLbl =
                  (fabric.lang.security.Label)
                    $readRef(fabric.lang.security.Label._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.infoLbl =
                  (fabric.lang.security.Label)
                    $readRef(fabric.lang.security.Label._Proxy.class,
                             (fabric.common.RefTypeEnum) refTypes.next(), in,
                             store, intraStoreRefs, interStoreRefs);
                this.startTime = (calendar.util.Date)
                                   $readRef(calendar.util.Date._Proxy.class,
                                            (fabric.common.RefTypeEnum)
                                              refTypes.next(), in, store,
                                            intraStoreRefs, interStoreRefs);
                this.endTime = (calendar.util.Date)
                                 $readRef(calendar.util.Date._Proxy.class,
                                          (fabric.common.RefTypeEnum)
                                            refTypes.next(), in, store,
                                          intraStoreRefs, interStoreRefs);
                this.$root = (calendar.event.Event)
                               $readRef(calendar.event.Event._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.event.Event.calendar$event$Event$_split_1._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_1._Impl)
                    other;
                this.timeLbl = src.timeLbl;
                this.infoLbl = src.infoLbl;
                this.startTime = src.startTime;
                this.endTime = src.endTime;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.Event.calendar$event$Event$_split_1.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_1._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_1._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_1.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_1.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_1.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_1.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_1.
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
                    return new calendar.event.Event.
                             calendar$event$Event$_split_1._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 20, -42, 39, 120,
        62, -124, -111, -9, 115, 90, -55, -57, -28, 41, -30, 92, 112, 37, -4,
        37, 70, 78, -72, 70, 47, -16, -54, 60, -51, 30, 98, -47 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511993786000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_1
      get$calendar$event$Event$_split_1();
    
    public calendar.event.Event.calendar$event$Event$_split_1
      set$calendar$event$Event$_split_1(
      calendar.event.Event.calendar$event$Event$_split_1 val);
    
    public static interface calendar$event$Event$_split_2
      extends fabric.lang.Object {
        public java.lang.String get$name();
        
        public java.lang.String set$name(java.lang.String val);
        
        public java.lang.String get$note();
        
        public java.lang.String set$note(java.lang.String val);
        
        public fabricated.util.List get$attendees();
        
        public fabricated.util.List set$attendees(fabricated.util.List val);
        
        public fabricated.util.List get$viewers();
        
        public fabricated.util.List set$viewers(fabricated.util.List val);
        
        public calendar.User get$creator();
        
        public calendar.User set$creator(calendar.User val);
        
        public fabric.lang.Object $initLabels();
        
        public calendar.event.Event get$$root();
        
        public static class _Proxy extends fabric.lang.Object._Proxy
          implements calendar$event$Event$_split_2 {
            public java.lang.String get$name() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$name();
            }
            
            public java.lang.String set$name(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$name(val);
            }
            
            public java.lang.String get$note() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$note();
            }
            
            public java.lang.String set$note(java.lang.String val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$note(val);
            }
            
            public fabricated.util.List get$attendees() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$attendees();
            }
            
            public fabricated.util.List set$attendees(
              fabricated.util.List val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$attendees(val);
            }
            
            public fabricated.util.List get$viewers() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$viewers();
            }
            
            public fabricated.util.List set$viewers(fabricated.util.List val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$viewers(val);
            }
            
            public calendar.User get$creator() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$creator();
            }
            
            public calendar.User set$creator(calendar.User val) {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).set$creator(val);
            }
            
            public calendar.event.Event get$$root() {
                return ((calendar.event.Event.calendar$event$Event$_split_2.
                          _Impl) fetch()).get$$root();
            }
            
            public _Proxy(calendar$event$Event$_split_2._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
        }
        
        public static final class _Impl extends fabric.lang.Object._Impl
          implements calendar$event$Event$_split_2 {
            public java.lang.String get$name() { return this.name; }
            
            public java.lang.String set$name(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.name = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String name;
            
            public java.lang.String get$note() { return this.note; }
            
            public java.lang.String set$note(java.lang.String val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.note = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            java.lang.String note;
            
            public fabricated.util.List get$attendees() {
                return this.attendees;
            }
            
            public fabricated.util.List set$attendees(
              fabricated.util.List val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.attendees = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabricated.util.List attendees;
            
            public fabricated.util.List get$viewers() { return this.viewers; }
            
            public fabricated.util.List set$viewers(fabricated.util.List val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.viewers = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            fabricated.util.List viewers;
            
            public calendar.User get$creator() { return this.creator; }
            
            public calendar.User set$creator(calendar.User val) {
                fabric.worker.transaction.TransactionManager tm =
                  fabric.worker.transaction.TransactionManager.getInstance();
                boolean transactionCreated = tm.registerWrite(this);
                this.creator = val;
                if (transactionCreated) tm.commitTransaction();
                return val;
            }
            
            calendar.User creator;
            
            public fabric.lang.Object $initLabels() {
                this.set$$updateLabel(
                       this.get$$root().get$jif$calendar_event_Event_info());
                this.set$$accessPolicy(this.get$$updateLabel().confPolicy());
                return (calendar$event$Event$_split_2) this.$getProxy();
            }
            
            public calendar.event.Event get$$root() { return this.$root; }
            
            private calendar.event.Event $root;
            
            public _Impl(fabric.worker.Store $location,
                         calendar.event.Event root) {
                super($location);
                this.$root = root;
            }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event.calendar$event$Event$_split_2.
                         _Proxy(this);
            }
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.name);
                $writeInline(out, this.note);
                $writeRef($getStore(), this.attendees, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.viewers, refTypes, out,
                          intraStoreRefs, interStoreRefs);
                $writeRef($getStore(), this.creator, refTypes, out,
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
                this.name = (java.lang.String) in.readObject();
                this.note = (java.lang.String) in.readObject();
                this.attendees = (fabricated.util.List)
                                   $readRef(fabricated.util.List._Proxy.class,
                                            (fabric.common.RefTypeEnum)
                                              refTypes.next(), in, store,
                                            intraStoreRefs, interStoreRefs);
                this.viewers = (fabricated.util.List)
                                 $readRef(fabricated.util.List._Proxy.class,
                                          (fabric.common.RefTypeEnum)
                                            refTypes.next(), in, store,
                                          intraStoreRefs, interStoreRefs);
                this.creator = (calendar.User)
                                 $readRef(calendar.User._Proxy.class,
                                          (fabric.common.RefTypeEnum)
                                            refTypes.next(), in, store,
                                          intraStoreRefs, interStoreRefs);
                this.$root = (calendar.event.Event)
                               $readRef(calendar.event.Event._Proxy.class,
                                        (fabric.common.RefTypeEnum)
                                          refTypes.next(), in, store,
                                        intraStoreRefs, interStoreRefs);
            }
            
            public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
                super.$copyAppStateFrom(other);
                calendar.event.Event.calendar$event$Event$_split_2._Impl src =
                  (calendar.event.Event.calendar$event$Event$_split_2._Impl)
                    other;
                this.name = src.name;
                this.note = src.note;
                this.attendees = src.attendees;
                this.viewers = src.viewers;
                this.creator = src.creator;
                this.$root = src.$root;
            }
        }
        
        interface _Static extends fabric.lang.Object, Cloneable {
            final class _Proxy
            extends fabric.
              lang.
              Object.
              _Proxy
              implements calendar.event.Event.calendar$event$Event$_split_2.
                           _Static
            {
                public _Proxy(calendar.event.Event.
                                calendar$event$Event$_split_2._Static.
                                _Impl impl) { super(impl); }
                
                public _Proxy(fabric.worker.Store store, long onum) {
                    super(store, onum);
                }
                
                public static final calendar.event.Event.
                  calendar$event$Event$_split_2._Static $instance;
                
                static {
                    calendar.
                      event.
                      Event.
                      calendar$event$Event$_split_2.
                      _Static.
                      _Impl
                      impl =
                      (calendar.
                        event.
                        Event.
                        calendar$event$Event$_split_2.
                        _Static.
                        _Impl)
                        fabric.lang.Object._Static._Proxy.
                        $makeStaticInstance(
                          calendar.event.Event.calendar$event$Event$_split_2.
                            _Static._Impl.class);
                    $instance =
                      (calendar.event.Event.calendar$event$Event$_split_2.
                        _Static) impl.$getProxy();
                    impl.$init();
                }
            }
            
            class _Impl
            extends fabric.
              lang.
              Object.
              _Impl
              implements calendar.event.Event.calendar$event$Event$_split_2.
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
                    return new calendar.event.Event.
                             calendar$event$Event$_split_2._Static._Proxy(this);
                }
                
                private void $init() {  }
            }
            
        }
        
        public static final byte[] $classHash = new byte[] { 20, -42, 39, 120,
        62, -124, -111, -9, 115, 90, -55, -57, -28, 41, -30, 92, 112, 37, -4,
        37, 70, 78, -72, 70, 47, -16, -54, 60, -51, 30, 98, -47 };
        public static final java.lang.String jlc$CompilerVersion$fabil =
          "0.3.0";
        public static final long jlc$SourceLastModified$fabil = 1511993786000L;
        public static final java.lang.String jlc$ClassType$fabil =
          "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";
    }
    
    public calendar.event.Event.calendar$event$Event$_split_2
      get$calendar$event$Event$_split_2();
    
    public calendar.event.Event.calendar$event$Event$_split_2
      set$calendar$event$Event$_split_2(
      calendar.event.Event.calendar$event$Event$_split_2 val);
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_L();
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_info();
    
    public fabric.lang.security.Label get$jif$calendar_event_Event_time();
    
    public fabric.lang.security.Principal get$jif$calendar_event_Event_p();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.event.Event {
        public calendar.event.Event.calendar$event$Event$_split_0
          get$calendar$event$Event$_split_0() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_0();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          set$calendar$event$Event$_split_0(
          calendar.event.Event.calendar$event$Event$_split_0 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_0(val);
        }
        
        public calendar.event.Event.calendar$event$Event$_split_1
          get$calendar$event$Event$_split_1() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_1();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_1
          set$calendar$event$Event$_split_1(
          calendar.event.Event.calendar$event$Event$_split_1 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_1(val);
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          get$calendar$event$Event$_split_2() {
            return ((calendar.event.Event._Impl) fetch()).
              get$calendar$event$Event$_split_2();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          set$calendar$event$Event$_split_2(
          calendar.event.Event.calendar$event$Event$_split_2 val) {
            return ((calendar.event.Event._Impl) fetch()).
              set$calendar$event$Event$_split_2(val);
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_L();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_info() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_info();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_time() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_time();
        }
        
        public fabric.lang.security.Principal get$jif$calendar_event_Event_p() {
            return ((calendar.event.Event._Impl) fetch()).
              get$jif$calendar_event_Event_p();
        }
        
        public calendar.event.Event calendar$event$Event$(
          int arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, calendar.util.Date arg4,
          calendar.util.Date arg5, java.lang.String arg6, java.lang.String arg7,
          fabricated.util.List arg8, fabricated.util.List arg9,
          calendar.User arg10) {
            return ((calendar.event.Event) fetch()).calendar$event$Event$(
                                                      arg1, arg2, arg3, arg4,
                                                      arg5, arg6, arg7, arg8,
                                                      arg9, arg10);
        }
        
        public static boolean jif$Instanceof(
          fabric.lang.security.Label arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.lang.security.Principal arg4,
          fabric.lang.Object arg5) {
            return calendar.event.Event._Impl.jif$Instanceof(arg1, arg2, arg3,
                                                             arg4, arg5);
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          fabric.lang.security.Label arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.lang.security.Principal arg4,
          fabric.lang.Object arg5) {
            return calendar.event.Event._Impl.jif$cast$calendar_event_Event(
                                                arg1, arg2, arg3, arg4, arg5);
        }
        
        public _Proxy(Event._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.event.Event {
        public calendar.event.Event calendar$event$Event$(
          final int uid_, final fabric.lang.security.Label timeLbl_,
          final fabric.lang.security.Label infoLbl_,
          final calendar.util.Date startTime_,
          final calendar.util.Date endTime_, final java.lang.String name_,
          final java.lang.String note_, final fabricated.util.List attendees_,
          final fabricated.util.List viewers_, final calendar.User creator_) {
            ((calendar.event.Event._Impl) this.fetch()).jif$init();
            {
                {
                    this.get$calendar$event$Event$_split_0().set$uid((int)
                                                                       uid_);
                    this.get$calendar$event$Event$_split_1().set$timeLbl(
                                                               timeLbl_);
                    this.get$calendar$event$Event$_split_1().set$infoLbl(
                                                               infoLbl_);
                    this.get$calendar$event$Event$_split_1().set$startTime(
                                                               startTime_);
                    this.get$calendar$event$Event$_split_1().set$endTime(
                                                               endTime_);
                    this.get$calendar$event$Event$_split_2().set$name(name_);
                    this.get$calendar$event$Event$_split_2().set$note(note_);
                    this.get$calendar$event$Event$_split_2().set$creator(
                                                               creator_);
                    this.get$calendar$event$Event$_split_2().set$attendees(
                                                               attendees_);
                    this.get$calendar$event$Event$_split_2().set$viewers(
                                                               viewers_);
                }
                this.fabric$lang$Object$();
            }
            return (calendar.event.Event) this.$getProxy();
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          get$calendar$event$Event$_split_0() {
            return this.calendar$event$Event$_split_0;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_0
          set$calendar$event$Event$_split_0(
          calendar.event.Event.calendar$event$Event$_split_0 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_0 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_0 calendar$event$Event$_split_0;
        
        public calendar.event.Event.calendar$event$Event$_split_1
          get$calendar$event$Event$_split_1() {
            return this.calendar$event$Event$_split_1;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_1
          set$calendar$event$Event$_split_1(
          calendar.event.Event.calendar$event$Event$_split_1 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_1 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_1 calendar$event$Event$_split_1;
        
        public calendar.event.Event.calendar$event$Event$_split_2
          get$calendar$event$Event$_split_2() {
            return this.calendar$event$Event$_split_2;
        }
        
        public calendar.event.Event.calendar$event$Event$_split_2
          set$calendar$event$Event$_split_2(
          calendar.event.Event.calendar$event$Event$_split_2 val) {
            fabric.worker.transaction.TransactionManager tm =
              fabric.worker.transaction.TransactionManager.getInstance();
            boolean transactionCreated = tm.registerWrite(this);
            this.calendar$event$Event$_split_2 = val;
            if (transactionCreated) tm.commitTransaction();
            return val;
        }
        
        public calendar$event$Event$_split_2 calendar$event$Event$_split_2;
        
        public _Impl(fabric.worker.Store $location,
                     final fabric.lang.security.Label jif$L,
                     final fabric.lang.security.Label jif$info,
                     final fabric.lang.security.Label jif$time,
                     final fabric.lang.security.Principal jif$p) {
            super($location);
            this.jif$calendar_event_Event_L = jif$L;
            this.jif$calendar_event_Event_info = jif$info;
            this.jif$calendar_event_Event_time = jif$time;
            this.jif$calendar_event_Event_p = jif$p;
        }
        
        private void jif$init() {
            this.
              set$calendar$event$Event$_split_0(
                (calendar$event$Event$_split_0)
                  new calendar.event.Event.calendar$event$Event$_split_0._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
            this.
              set$calendar$event$Event$_split_1(
                (calendar$event$Event$_split_1)
                  new calendar.event.Event.calendar$event$Event$_split_1._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
            this.
              set$calendar$event$Event$_split_2(
                (calendar$event$Event$_split_2)
                  new calendar.event.Event.calendar$event$Event$_split_2._Impl(
                    this.$getStore(), (calendar.event.Event) this.$getProxy()).
                  $getProxy());
        }
        
        public static boolean jif$Instanceof(
          final fabric.lang.security.Label jif$L,
          final fabric.lang.security.Label jif$info,
          final fabric.lang.security.Label jif$time,
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return false;
            fabric.lang.security.LabelUtil._Impl.
              accessCheck(
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      fabric.worker.Worker.getWorker().getLocalStore(),
                      jif$L.
                          meet(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.
                                toLabel(
                                  fabric.worker.Worker.getWorker().
                                      getLocalStore(),
                                  fabric.lang.security.LabelUtil._Impl.
                                      readerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal()),
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        fabric.worker.Worker.getWorker().
                                            getLocalStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal())),
                            true),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            fabric.worker.Worker.getWorker().getLocalStore(),
                            fabric.lang.security.LabelUtil._Impl.topInteg()),
                      true),
                o);
            if (fabric.lang.Object._Proxy.
                  $getProxy(
                    (java.lang.Object)
                      fabric.lang.WrappedJavaInlineable.
                      $unwrap(o)) instanceof calendar.event.Event) {
                calendar.event.Event c =
                  (calendar.event.Event) fabric.lang.Object._Proxy.$getProxy(o);
                boolean ok = true;
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_L(), jif$L);
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_info(),
                                 jif$info);
                ok =
                  ok &&
                    fabric.lang.security.LabelUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_time(),
                                 jif$time);
                ok =
                  ok &&
                    fabric.lang.security.PrincipalUtil._Impl.
                    equivalentTo(c.get$jif$calendar_event_Event_p(), jif$p);
                return ok;
            }
            return false;
        }
        
        public static calendar.event.Event jif$cast$calendar_event_Event(
          final fabric.lang.security.Label jif$L,
          final fabric.lang.security.Label jif$info,
          final fabric.lang.security.Label jif$time,
          final fabric.lang.security.Principal jif$p,
          final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.event.Event._Impl.jif$Instanceof(jif$L, jif$info,
                                                          jif$time, jif$p, o))
                return (calendar.event.Event)
                         fabric.lang.Object._Proxy.$getProxy(o);
            throw new java.lang.ClassCastException();
        }
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_L() {
            return this.jif$calendar_event_Event_L;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_L;
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_info() {
            return this.jif$calendar_event_Event_info;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_info;
        
        public fabric.lang.security.Label get$jif$calendar_event_Event_time() {
            return this.jif$calendar_event_Event_time;
        }
        
        private fabric.lang.security.Label jif$calendar_event_Event_time;
        
        public fabric.lang.security.Principal get$jif$calendar_event_Event_p() {
            return this.jif$calendar_event_Event_p;
        }
        
        private fabric.lang.security.Principal jif$calendar_event_Event_p;
        
        public fabric.lang.Object $initLabels() {
            this.set$$updateLabel(
                   this.get$jif$calendar_event_Event_L(
                          ).meet(this.$getStore(),
                                 this.get$jif$calendar_event_Event_info(),
                                 true));
            this.
              set$$accessPolicy(
                fabric.lang.security.LabelUtil._Impl.
                    join(
                      this.$getStore(),
                      this.
                          get$jif$calendar_event_Event_L().
                          meet(
                            this.
                                $getStore(),
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
                                  fabric.lang.security.LabelUtil._Impl.
                                      writerPolicy(
                                        this.$getStore(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal(),
                                        fabric.lang.security.PrincipalUtil._Impl.
                                            topPrincipal())),
                            true),
                      fabric.lang.security.LabelUtil._Impl.
                          liftToLabel(
                            this.$getStore(),
                            fabric.lang.security.LabelUtil._Impl.topInteg()),
                      true).confPolicy());
            $initPartitions();
            return (calendar.event.Event) this.$getProxy();
        }
        
        public void $initPartitions() {
            super.$initPartitions();
            this.get$calendar$event$Event$_split_0().fabric$lang$Object$();
            this.get$calendar$event$Event$_split_1().fabric$lang$Object$();
            this.get$calendar$event$Event$_split_2().fabric$lang$Object$();
        }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.event.Event._Proxy(this);
        }
        
        public void $serialize(java.io.ObjectOutput out,
                               java.util.List refTypes,
                               java.util.List intraStoreRefs,
                               java.util.List interStoreRefs)
              throws java.io.IOException {
            super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$Event$_split_0, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$Event$_split_1, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.calendar$event$Event$_split_2, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_L, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_info, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_time, refTypes,
                      out, intraStoreRefs, interStoreRefs);
            $writeRef($getStore(), this.jif$calendar_event_Event_p, refTypes,
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
            this.calendar$event$Event$_split_0 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_0)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_0.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.calendar$event$Event$_split_1 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_1)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_1.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.calendar$event$Event$_split_2 =
              (calendar.
                event.
                Event.
                calendar$event$Event$_split_2)
                $readRef(
                  calendar.event.Event.calendar$event$Event$_split_2.
                    _Proxy.class, (fabric.common.RefTypeEnum) refTypes.next(),
                  in, store, intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_L =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_info =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_time =
              (fabric.lang.security.Label)
                $readRef(fabric.lang.security.Label._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
            this.jif$calendar_event_Event_p =
              (fabric.lang.security.Principal)
                $readRef(fabric.lang.security.Principal._Proxy.class,
                         (fabric.common.RefTypeEnum) refTypes.next(), in, store,
                         intraStoreRefs, interStoreRefs);
        }
        
        public void $copyAppStateFrom(fabric.lang.Object._Impl other) {
            super.$copyAppStateFrom(other);
            calendar.event.Event._Impl src = (calendar.event.Event._Impl) other;
            this.calendar$event$Event$_split_0 =
              src.calendar$event$Event$_split_0;
            this.calendar$event$Event$_split_1 =
              src.calendar$event$Event$_split_1;
            this.calendar$event$Event$_split_2 =
              src.calendar$event$Event$_split_2;
            this.jif$calendar_event_Event_L = src.jif$calendar_event_Event_L;
            this.jif$calendar_event_Event_info =
              src.jif$calendar_event_Event_info;
            this.jif$calendar_event_Event_time =
              src.jif$calendar_event_Event_time;
            this.jif$calendar_event_Event_p = src.jif$calendar_event_Event_p;
        }
    }
    
    interface _Static extends fabric.lang.Object, Cloneable {
        public fabric.worker.Worker get$worker$();
        
        final class _Proxy extends fabric.lang.Object._Proxy
          implements calendar.event.Event._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric$1() {
                return ((calendar.event.Event._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric$1();
            }
            
            public _Proxy(calendar.event.Event._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.event.Event._Static $instance;
            
            static {
                calendar.
                  event.
                  Event.
                  _Static.
                  _Impl
                  impl =
                  (calendar.event.Event._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.event.Event._Static._Impl.class);
                $instance = (calendar.event.Event._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.event.Event._Static {
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
            
            public java.lang.String get$jlc$ClassType$fabric$1() {
                return this.jlc$ClassType$fabric$1;
            }
            
            public java.lang.String jlc$ClassType$fabric$1;
            
            public void $serialize(java.io.ObjectOutput out,
                                   java.util.List refTypes,
                                   java.util.List intraStoreRefs,
                                   java.util.List interStoreRefs)
                  throws java.io.IOException {
                super.$serialize(out, refTypes, intraStoreRefs, interStoreRefs);
                $writeInline(out, this.jlc$CompilerVersion$fabric);
                out.writeLong(this.jlc$SourceLastModified$fabric);
                $writeInline(out, this.jlc$ClassType$fabric);
                $writeInline(out, this.jlc$ClassType$fabric$1);
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
                this.jlc$ClassType$fabric$1 = (java.lang.String)
                                                in.readObject();
            }
            
            public _Impl(fabric.worker.Store store) { super(store); }
            
            protected fabric.lang.Object._Proxy $makeProxy() {
                return new calendar.event.Event._Static._Proxy(this);
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
    
    public static final byte[] $classHash = new byte[] { 20, -42, 39, 120, 62,
    -124, -111, -9, 115, 90, -55, -57, -28, 41, -30, 92, 112, 37, -4, 37, 70,
    78, -72, 70, 47, -16, -54, 60, -51, 30, 98, -47 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511993786000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "H4sIAAAAAAAAAN28eewr230fxvf0VlnWZsl2FEu+ka+V98znOxxySM74Rm45+0bOvirO83D24WychTMcV00auLFhF26ayo5TNO4fVZBNTYogRloEAhwgtePGCeKgcNOgbQTDadM6Rmu0afpH2nTI3903PctSY+eHy8PhWb7nzHf5fL9n7vfMl35j8mpdTT4dOPs4vdOcS7++Qzp7hhedqvY9LHXqWh1r33W/6RXmp/7Jn/U+9fLkZX7yAdfJizx2nfTdvG4mH+QT5+QAud8Amszc/dzkTfcykHbqqJm8/Dm0rya3yiI9h2nR3JvkKfo/OQW+8Cf/0If/yvsmH7InH4pzpXGa2MWKvPH7xp58IPOzvV/VG8/zPXvykdz3PcWvYieNh7FjkduTj9ZxmDtNW/m17NdFerp0/Gjdln51nfN+5WX5xbjsqnWbohqX/+Gb5bdNnAJ8XDd3+clrQeynXn2c/NuTV/jJq0HqhGPHb+Xv3wVwpQiQl/qx+/vjcZlV4Lj+/SGvHOLcaybf+eSIB3d8mxs7jENfz/wmKh5M9UrujBWTj94sKXXyEFCaKs7DseurRTvO0kw+8VyiY6c3Ssc9OKH/bjP59if7iTdNY683r2y5DGkmH3+y25XSKLNPPCGzR6T1G7s/8BM/lNP5y5OXxjV7vpte1v/GOOhTTwyS/cCv/Nz1bwZ+4Hv4n3K+9cs/+vJkMnb++BOdb/r8tX/rN//Ndz71c3/rps/vfUYfYZ/4bvOu+8X9B3/5O7C3kfddlvFGWdTxRRUeu/OrVMV7LXf7ctT2b31A8dJ4537jz8k/b/2Rv+D/+suT9zOT19wibbNRqz7iFlkZp35F+blfOY3vMZM3/dzDru3M5PXxmo9z/6ZWCILab5jJK+m16rXi+ntkUTCSuLDo9fE6zoPi/nXpNNH1ui8nk8nr42fy0fHz5vj5qXvfP95MZECrR+UHiIu270eFAXC/PjRFCWyJPHxXrIoLPwDMScc1ONX3jiZcxS5QVy7g3qsD/JOfNwBxKe+M5l5+Q6j2l3v5cPfSSyObv9MtPH/v1KPM7ukPKqajidBF6vnVu276E19mJt/y5T911aE3L3pfj7p75dJLo9y/40nEeHTsF1qU+M2/9O7fvtG/y9h7TGwmH7u/tjvXtd25rm1czgcuFnVnxKg7I0Z96aX+DvYzzF+8Ks5r9dXCHlB4c7yR70uLkU4/eeml67187Dr4qi6jsA8jiIw48YG3lR9gf/BHP/2+UU/L7pVRVJeut5+0modYw4xXzmgK77of+pF/8n/95Z/6fPHQfprJ7afM+umRF7P89JOMqQrX90bYe0j+e245P/vulz9/++ULpLw5ol3jjPo4QsennpzjMfO8ex/qLqx4lZ98U1BUmZNemu7j0/ubqCq6hzVXgX/wev2Rfzn+vTR+/t/L56LJl4rL94hn2D0ruvXAjJrJT//qj33xV//Yn/i+p9tuvfWCpvLS8PVX3e8DoXdA8HvBxdtvlzdqfJH7E7y+Av5nlfJP/4O/+78srq7wvm/40CNORPGbu4/g0YXYh67I85GHaqRWvj/2+x9+WvwPf/I3fuRzVx0ae3zXsya8fSkvrHBGFhTVv/u3jv/dP/ofv/jfvPxQ75rJa2W7T2P3uvLvGgl95uFUI1SlIzfGldS3tTwrvDiInX3qX3T4X3zou8Gf/ac/8eEbRUzHmhuxVpN3vjqBh/W/B538kb/9h/75p65kXnIvrvIhOx52u8Hfb3lIeVNVzvmyjv7f+fuf/FO/4Pzp0SBH9Kzjwb8C4ivX23vlql8fHz1fcJXjnYtfvFP7blvFzfkOP2pAeu3ye5rJBy6iLFOnuejulRvQtbhP4lPPJCGOAODGpfMcMlc6i2vbnWs5v6j1dW2Ta9tnL8Wn+2vbd1zrP1A/7QvJS1Dx0Ept4Ev/8Sew7//1GwB8YKUXGr/vGQCoO48AyPwvZP/s5U+/9l+9PHndnnz4Gs84eaM7aXvRKnuMSGrsXiU/+ebH2h+PLm5c6d0HKPQdTyLEI9M+iQ8PgXe8vvS+XL//BhKueti/NCkvF9h1xGeu5duX4p0rj15uLth7ifOakXCcj4B7HdZMXu+K6uBXt+9L7WP3pHZTfce4fl3aPnFjqZfy37g35WgMr87uLO7MLr+5Z8/8vsvl914K8lJQ9+f9RJK6t++Djj4izKi0t2/mvr+UD1+196o+N5HZ8zXviXWNGvHBh4P5YgzqfvzX/vgv/fvf9Y9GDWAnr54u0hkF/8gMu/YS9f6xL/3kJ7/pC1/58avBj9b+g2/+w+//4xeq6qXYNpNPXpatFG3l+rxTN9urhfre/ZU/rYmjvmcjNp3uRWX+j37hx/7lnZ/4wg0K3ISu3/VU9PjomJvw9XqX33xzf+Msv+9Fs1xHkP/zX/78X/9zn/+Rm9Duo48HYkTeZv/Zr/w/v3Tnp7/yi89w7K+kxY2TflLctyY0VDOb+3/CDPYXnQbus+Gw3JgHFt2EGCayksz5mITBxdmQzxsFQzdRQdiHzB2EQ0HvhoRZY11txMA8MlCljjfTo5YlqNIb0SLag4tihF9J52nEO2LzY2NmyDrupjWScU0zLFendur6/sq2Nwv0tKyC/dTf53geCB6wXLRu707jeobNI6zX5KOmm0ulTCSwZ/WdGYnQXMlTHGt0ojwYYdwr9HLg6gWig6rf6qNfwz1GVCSbTFkWPYJHrDxtGQXFnZOu4Easz/yUjHXHdE4kc5JL3Dk0ykA0ZV0qO1TmKYKNunlZ5rrkadBwLK1TdQ5EJdspGStwSrXtDehQ1NVWPugKocfzhCw5kjou3QI9ZnYKRbRuCChJuwC70UBOn1kyF4XhMs7lNmQwlNivNpvp4uTzMA6aPQibkd1njIbseGaWlkyiMILMK85On4EGjnOKWSAEtZNIzytdUKqk9qgSSa07kFlHJUEfy5JQOMopD5xArEyjHiKO2LkeLx+PUaZjdVkMRbvSmb01C5NtSc1SRkjteLd0dXBfQpa+kDGq5KnTQQWrUERCh6AGX3WmO5F2hX25ApFZ5Z/AdZriGo8qZa0YlM2FZ8LaoSvqYPiVVO6VOZeXoY3Hp8g+ElAZJxFrHVslJUFmlRW9fSQPhbLiYstWdJDlSUsxcsnTsZ5lBYGQhUTlN/KSObRKfaTLZY6emWOh4PYJ8KyGKHWdCHOwaRo8AjViCWkaajl+LEMJo9pqvTOKGueHziKjpGIjkYtwbYE75Hl7OnJRq/U9yh0FJdayXkdkFtfnQqXs9NZomA0aAt1elmdxnPhUlulEwhFAs1wlgSQfbUNMNhtNOiegXgtGzEqUz6mHwxawIztoWwya784Wt9HYwWCpRKIRMUxUK1zLVqyEq61EjXpmWaCJmaAYWIPDhIftMc3r42zIdsF0jlPZlhTzFQryLa8ZnnI2Smp34M9AGWBkuDd0bS1sEv4MpSmKTrmVXADMoo5d8KhGPUHPG7IlozTIu5WrAe2iGkK4WBcpKvFTlTES1ZZPSmHs9g6UldpMQUyrKAQ2ZU5LVKiq2swRjWlbA5GsrmhMWRntRknMOhaslBKiE6ySB50hYCymW9lPNG0GD1BLOSCUQwUfligfHBh26hvqApxtFxnDxKvWZIt4pcMwChhQhKVbxJhl9XYvQ4jFLGtdi6wU2CTT0uG0sjiISg8Kqc4ulKUxmhDoFivWsLUBIisyoCRYOilOWFFaVUwJDK3pmK0sRyeVCLO3wdwG5TBlE9aMezYgWC4RoLWOrefiWrO8c+W7bCWFRHUQEbEYF7pql1y3pPtOyB11ha7jbWztpX6lNFiWVVJTMIK62BTHI5OtoHh/KiWG1PV2FUwZXXHzjexkOx0To5xpuIiaHw5sKGFCKcHxyHXJcuBoXwjQrF/pymrlNQCfwfE5LgEanGuypvGmu9zb1d5DlGS+NNiwmkInFTpHM5VflxrJFyAB+PuMA4mSUjWHO3uloic9sQBrqzA4WMF7Dz25ObjYpz1FE2KRTm3wuHdTh688jEN1QrANn5jv5fEfmOwAYcGbbD2buwehUMQtsrKTUICPyKzZgoZ0UPfzbiGei4KWZt4cVFBGjYNkOwuZTgR2TbKP4JYG2WRKbW1FYixzFkhzTjqKKgdpFDdfNQ3USs6iTgIPiW313G0L7kxNIYaSAHW62UhucsRnwLqfko5caVYvQDYaVOvzck+sBwA5rt0sZviCxUwesugQGNaFA5VNb+QKaZkE4AWtsx+SodrtqxnVMKpBwcGxCKm6gdXu0Ee8sMijeO22J2BOAyPKNI5ksd32YBxK7lDRBIkKNmbhA0Jh/TxhTrNdzWXRIu44njxJ2Sq2sqxWpbYidP0YK8dwXsIaLiMLZDfzTk5SFCuF2KaM2eeqG5KgvzucrIDmSRkS+szabAlPFRShP4LYYtGMwcnRPynocZN47u6EtrMp34DimpUg0FJWmkYAhrWBOQxlAKOvpE43u0ShaDyCVjS6S6ZwIGF0Wswoid3s6LE/gcpJBsy0Yh1xC/8kRafRj0+XhW0KkYYj/GnDN8GePUunzcjG7YH2h+UCzgagjYQCXHE1VXOhx21ZA7IlaCGHMu2rrszZMye0a59ZkSarqL3Is6yPIKO/66CEPSWWBWRtB6DFocwbS3HjFZV4OsmX/JGaHTDFLJMm9ZIjvWMgroOTyIvjESKFpRwgHIFP/QOUlAdi3HDSii7gyoZcZSt5JiWlpcV+sG0MU25HLeWKqqm3LSBCAWOoA+R0m8PeK9u811NNgGoMM2KZ4VWoWDmtsneVJbrcHYWNmiYHqRV4hjS4mAhBjm8OENtkHWM2rhTQ4r7KcHiwmzlY46CxrI+F3dgyW+EHox9K0gC1+JxR9rqPWsk1VHDVJNWZc0E+qqJ+lpWBn9ON6pA8fcrSs3CG88EnBlZTqpF8zqx8p1oPjU7hjlMLAUz5wDSoqekUXgE0zR9JuQyDSFsB5bZTYQmyDerAzLcMOnNt0sR8u3SKrpRy2l/Npy7o1nmhEZpEckkvS4bCJBVXhJEKZag2YlJ5DPBStXQU4Oms2h4dWJrRe2zl7FgmlI9pCACOwJlZlOMsih8Ly1gago7WXrVYdccDfaraxodV7bAuoPNRx+3ZFmroXBoir20XwaBFIkhEg2ai/kne8Y6EIetxOXbQFdOUOgbtyAQpl3XRJFsLOZqMLS3DrE1gkNgtbSGdLbE1tp/bfArsIFJvc2cfCVbkcZgS4YMTrg/seVS7lK83TLJmRg+9bnNjDXlbJD0tTmcOK/YMKy/xHSG0S8EPBrwC4dZYzGCkOIs1krtbIhltcKVgg2FR0zWFqpkFKfYJVyDzAEvTeaDExnLocqw6HNYambCeKNg6M8N0tmYroZCxWcVibCeagRhTycqcCpZvDvqhlyDRKOYHiln7TY2GdhfKGWeMVo62ywVGhApsWIeiAIgVGUOmBQxs2DQ92o6IitcgtkmPCabsGkYUz/p0A+ArnAYkApVw1qAqO8fYQlWq0Tbg7Q5TleVsumubknKLEtyLq8OC76v51NOFxV7uiIHcxn2TtwFh7XmU2vgmxiinwl+AYRSBwbA6r1yX3s3nKZkOcZ7wu1gx9/Rp7ZXradG2/m45HEqf94vMaI22nrWmkXPA2Vs4wNz2FVmw58TR5JpIZVJ5DTUkopILzRzjSzfenY2jC6OjqVkCLzdMkIdNnZKKl5lJcFraZj9tstOcWkn0bociOEvxFc7SK72VwhmHzYOqcgNwrtb0cdGa/qp33IVCTBE/z4/8qoc8jnfQBYiskH6b4tO5uzI5MVzPcdPpGZsuCUca2ABZDHHFQlAdnGaarBs9MFT1mlBV2zC6MxnJM8+ASH8X4cfp0evH0BRwgpPPzANghoc46WKyvA4RTK9Rt8J3uwPazQgmgpfsDh+DA7Zlg3DQkKyLeYcrd2SrRb6DO2nTA+uRfzTqCmvlDIaVs6D3LUt7U4AH3JM1rP34fB62RzLKDwMjZeGCgvhKFT3LXzM931I70ml8WvO6ZAytMR/d2fC6NCQrWA5xyfuzJbePQov0pWoT9btKStL9gdhQ8iqdI32kFyeTp0EDYbJm2ANZpUAhpFXT09pcMaRoiuBOAwUAL70dZ/frVlTd2Lc1xFyl1RqcWc3CRYCE6lzBEqu1eJgHqxQEc3kPz7p1pOjdYr9lWB13YTjdn6Blt8YlapYz6VQknbztFkbCWmFMEFJPIGd95BXItbVniMhqB1onPa9tHGrZhbyPvCqpi9E8+z2towa0UI7ssDn34pyjwJW3T8rzvhGrrap7yPzUGy6qHkQ7lwGETvBWmgPb2gC7ZCZy2fYQLZKh2OD6qGFQFnndCm3cZSaQRxMrLUeMHWpjwC5npfUupWd6f0CUANhYipZY3XFkBAyOAYTiioy/F/rVmnWYZXSkQE6a1bPDIqc4fjtizQYOd+oWUpRUD7nAnvOdRwdzNGJd3T6QtQmskb0gBg4SzMDQ8TJ6eeC9aGvvWofF8kXY6eSeCaCZwnX7eM8MejSPzSQ6rglP0dGMQCnFtfMGK1GVVjBvVx8wQrYAJsupdTlsiNUQBDXdLKc2vBPUFpz1eytaTEVb0miRBqWpFVD5UMBI2JWbgFlk51OysRObLd10xE10vmx2MxDUlr1BjXGGnqgJky3kDgBcgd2fV4dEKYF+hH1wzR3AFECgdZjIjdTtToHMMrogYtsE2K9r3VeSBEg8KK77evRV271QR/O1JVhCGrVcjyKmUJBrh1GBbuv0WAQNELWHF0TNdkyzCKia2oAiKeLbtlG6RbHawNvzdo8rhTmqNc+f7AAT4LWL1UPtmOg0ghivE/xVtWlwcCOv+Uw6ugPRkXm10yHsUAN2lm4O8JpiiGZ6LDYzXLBmNIV1itgcCTSga6bfddPToIVkTJtHORLlmbaEwN5d6wWDtYu5SBUbDJuR1DQnqHxacvY00kPQJZrx53nqF70cUeeihrcqBvr4bGjUqDnC+qkW5dSgxWzPEidlbx3wrWssgGAKl/PzuF/wT9HZy7KWpsmCLSlQ8gHqRFV5zYInjqg8aQ2mpa2Q3Hn0AAv2HPkn0hfLGXiqGtmV68weUSboVARR5FKV2CN14KVgsXXmK0aulgE507vBVbbj1m7T+cws2tF7FInc1t5OR3aMoM8fYVUeeGr8bIhtUXsO7aKFkAa4bO38jFR6cdqNgQ8x9UDEXneuKicgtUSIzLS0sM3z8qRMpf0WWiUrppXWcgyn4AZN6M2JxKlDHJut3y6R4LjWJICzGaQRcRpcGwbgRqstFp3Igw94goWBs1BWT+npxKnLddMCHMkTVE10xziLlPawwHPFDRdGkdpNVskuVglrfNrRWc9G+EnMuYoYqB4lkMKSqWZJzRYVbe4ExKbFfFs5gZA5vYzgc7HKmhN4WlTycHKckxZInDMvQH4Pti6mNMJxxu+oOVpu7c3ZsXd5UmZdofQH2DZnqVZQGyZjltNomhEZfF66YF7B7NxCS7dnRZcOk3UlBEtmvklzLVow3knQzQ2SYalXwylxXI7igD1TdpP90FEGeGSVcpU01JGNi7Y/zI5JvjZnpNrS5DJotnOFmI3bMGwNJy5tbossVAt5IZQ7gjDTOZ9DFJbsmKIeDMBh8oM4i8L56EdEaZtSliZqbq8l6zy2UGqAsU3CsXnBu/rYjBSqKqGdISbiTg9VnkvbDsUFZ1F0HCkyUnyxh/MhJC2KH3pbLLodJiw9eJcBFkMj1kzbCBuL3m564yQaQDylTDlkNxVQ4n6JdBGAYdv0TG2nBLC2Rk8GdJE9JRgTINWtgMA8g9K1rAfyLI0y0oc2i8Te2fwspF1rj9n7c5BFeDKslpFLSpnTskTLR6pzZOxcp1TOzgpMVZvybG/g0cP0IMLs7Myv7WLDqWN4QnnHbVIPu32+1UuR5UTuVNSx7KzXGApoNQssOHy7PMlAnIobVSwzNiPOC3YroJtjyRfRZr8d5lhs74OTZu2mbD1FEdSisvP0QMWDoGxAaguysYgT3W4fnreDXjQjG+ljhZJ60snAGOJQii0tljt8Z8kzwzDOmlmj2OrYpCqP5BCUNjR9wGhnuVjYpaBiXoEmprFc9clyvguEWoL5cNCpcEXP4aCJolOxXM5inKp9bdvF7Mra6By3Vc+Ihh8UuDLr9eiPT+gczkVABuHDGUBMbtz+lkbjTFUmYLWI0VTO";
    public static final java.lang.String jlc$ClassType$fabil$1 =
      "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";
}
