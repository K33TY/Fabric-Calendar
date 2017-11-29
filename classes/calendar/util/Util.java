package calendar.util;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
import java.io.PrintStream;
import fabric.runtime.Runtime;
import calendar.event.*;

public interface Util extends fabric.lang.Object {
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.util.Util {
        public static fabric.lang.arrays.ObjectArray copyEventArray(
          fabric.lang.arrays.ObjectArray arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.worker.Store arg4)
              throws java.lang.NullPointerException {
            return calendar.util.Util._Impl.copyEventArray(arg1, arg2, arg3,
                                                           arg4);
        }
        
        public static calendar.event.Event copyEvent(
          calendar.event.Event arg1, fabric.lang.security.Label arg2,
          fabric.lang.security.Label arg3, fabric.worker.Store arg4)
              throws java.lang.NullPointerException {
            return calendar.util.Util._Impl.copyEvent(arg1, arg2, arg3, arg4);
        }
        
        public _Proxy(Util._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.util.Util {
        /**
   * Copy the contents of an event into another event with the given labels.
   *
   * @throws NullPointerException
   *         if events is null
   */
        public static fabric.lang.arrays.ObjectArray copyEventArray(
          final fabric.lang.arrays.ObjectArray events,
          final fabric.lang.security.Label l,
          final fabric.lang.security.Label m, final fabric.worker.Store s)
              throws java.lang.NullPointerException {
            final fabric.lang.arrays.ObjectArray
              result =
              (fabric.lang.arrays.ObjectArray)
                new fabric.lang.arrays.ObjectArray._Impl(s).
                fabric$lang$arrays$ObjectArray$(
                  calendar.util.Util._Static._Proxy.$instance.get$$updateLabel(
                                                                ),
                  calendar.util.Util._Static._Proxy.$instance.get$$updateLabel(
                                                                ).confPolicy(),
                  calendar.event.Event._Proxy.class, events.get$length()).
                $getProxy();
            try {
                for (int i = 0; i < events.get$length(); i++) {
                    result.set(i, (calendar.event.Event) events.get(i));
                }
            }
            catch (final java.lang.ArrayIndexOutOfBoundsException e) {
                throw new calendar.util.AssertionFailedError().
                  util$AssertionFailedError$(
                    "result and events have the same length.");
            }
            try { return result; }
            catch (final java.lang.NullPointerException e) {
                throw new java.lang.NullPointerException();
            }
        }
        
        public static calendar.event.Event copyEvent(
          final calendar.event.Event event, final fabric.lang.security.Label l,
          final fabric.lang.security.Label m, final fabric.worker.Store s)
              throws java.lang.NullPointerException {
            return null;
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.util.Util._Proxy(this);
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
          implements calendar.util.Util._Static {
            public _Proxy(calendar.util.Util._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.util.Util._Static $instance;
            
            static {
                calendar.
                  util.
                  Util.
                  _Static.
                  _Impl
                  impl =
                  (calendar.util.Util._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(calendar.util.Util._Static._Impl.class);
                $instance = (calendar.util.Util._Static) impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.util.Util._Static {
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
                return new calendar.util.Util._Static._Proxy(this);
            }
            
            private void $init() {  }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 73, 33, 17, 104, 10,
    -39, -16, -23, 1, 29, 116, 95, -63, 65, 122, -16, 100, -55, 43, 3, 85, -18,
    61, -101, 99, -114, 47, 62, -59, -5, -5, -56 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1511979541000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "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";
}
