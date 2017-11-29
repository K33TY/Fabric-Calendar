package calendar.util;

import fabric.lang.*;
import fabric.lang.security.*;
import fabric.worker.*;
import fabric.worker.remote.*;
import java.lang.*;
/**
*   A class to transfer confidentiality and/or integrity rights between principals
*
*/
public interface Declassifier extends fabric.lang.Object {
    public calendar.util.Declassifier calendar$util$Declassifier$();
    
    public static final java.lang.String jlc$CompilerVersion$fabric = "0.3.0";
    public static final long jlc$SourceLastModified$fabric = 1510972468000L;
    public static final java.lang.String jlc$ClassType$fabric =
      "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";
    
    public void jif$invokeDefConstructor();
    
    public fabric.lang.Object $initLabels();
    
    public void $initPartitions();
    
    public static class _Proxy extends fabric.lang.Object._Proxy
      implements calendar.util.Declassifier {
        public calendar.util.Declassifier calendar$util$Declassifier$() {
            return ((calendar.util.Declassifier) fetch()).
              calendar$util$Declassifier$();
        }
        
        public void jif$invokeDefConstructor() {
            ((calendar.util.Declassifier) fetch()).jif$invokeDefConstructor();
        }
        
        public static boolean jif$Instanceof(fabric.lang.Object arg1) {
            return calendar.util.Declassifier._Impl.jif$Instanceof(arg1);
        }
        
        public static calendar.util.Declassifier
          jif$cast$calendar_util_Declassifier(fabric.lang.Object arg1) {
            return calendar.util.Declassifier._Impl.
              jif$cast$calendar_util_Declassifier(arg1);
        }
        
        public _Proxy(Declassifier._Impl impl) { super(impl); }
        
        public _Proxy(fabric.worker.Store store, long onum) {
            super(store, onum);
        }
    }
    
    public static class _Impl extends fabric.lang.Object._Impl
      implements calendar.util.Declassifier {
        public calendar.util.Declassifier calendar$util$Declassifier$() {
            ((calendar.util.Declassifier._Impl) this.fetch()).jif$init();
            { this.fabric$lang$Object$(); }
            return (calendar.util.Declassifier) this.$getProxy();
        }
        
        public _Impl(fabric.worker.Store $location) { super($location); }
        
        public void jif$invokeDefConstructor() {
            this.calendar$util$Declassifier$();
        }
        
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
                  $unwrap(o)) instanceof calendar.util.Declassifier;
        }
        
        public static calendar.util.Declassifier
          jif$cast$calendar_util_Declassifier(final fabric.lang.Object o) {
            if (fabric.lang.Object._Proxy.idEquals(o, null)) return null;
            if (calendar.util.Declassifier._Impl.jif$Instanceof(o))
                return (calendar.util.Declassifier)
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
            this.set$$accessPolicy(
                   fabric.lang.security.LabelUtil._Impl.noComponents(
                                                          ).confPolicy());
            $initPartitions();
            return (calendar.util.Declassifier) this.$getProxy();
        }
        
        public void $initPartitions() { super.$initPartitions(); }
        
        protected fabric.lang.Object._Proxy $makeProxy() {
            return new calendar.util.Declassifier._Proxy(this);
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
          implements calendar.util.Declassifier._Static {
            public fabric.worker.Worker get$worker$() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$worker$();
            }
            
            public java.lang.String get$jlc$CompilerVersion$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$CompilerVersion$fabric();
            }
            
            public long get$jlc$SourceLastModified$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$SourceLastModified$fabric();
            }
            
            public java.lang.String get$jlc$ClassType$fabric() {
                return ((calendar.util.Declassifier._Static._Impl) fetch()).
                  get$jlc$ClassType$fabric();
            }
            
            public _Proxy(calendar.util.Declassifier._Static._Impl impl) {
                super(impl);
            }
            
            public _Proxy(fabric.worker.Store store, long onum) {
                super(store, onum);
            }
            
            public static final calendar.util.Declassifier._Static $instance;
            
            static {
                calendar.
                  util.
                  Declassifier.
                  _Static.
                  _Impl
                  impl =
                  (calendar.util.Declassifier._Static._Impl)
                    fabric.lang.Object._Static._Proxy.
                    $makeStaticInstance(
                      calendar.util.Declassifier._Static._Impl.class);
                $instance = (calendar.util.Declassifier._Static)
                              impl.$getProxy();
                impl.$init();
            }
        }
        
        class _Impl extends fabric.lang.Object._Impl
          implements calendar.util.Declassifier._Static {
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
                return new calendar.util.Declassifier._Static._Proxy(this);
            }
            
            private void $init() {
                {
                    {
                        fabric.worker.transaction.TransactionManager $tm95 =
                          fabric.worker.transaction.TransactionManager.
                          getInstance();
                        boolean $backoffEnabled98 =
                          fabric.worker.Worker.getWorker(
                                                 ).config.txRetryBackoff;
                        int $backoff96 = 1;
                        boolean $doBackoff97 = true;
                        $label91: for (boolean $commit92 = false; !$commit92;
                                       ) {
                            if ($backoffEnabled98) {
                                if ($doBackoff97) {
                                    if ($backoff96 > 32) {
                                        while (true) {
                                            try {
                                                java.lang.Thread.sleep(
                                                                   $backoff96);
                                                break;
                                            }
                                            catch (java.lang.
                                                     InterruptedException $e93) {
                                                
                                            }
                                        }
                                    }
                                    if ($backoff96 < 5000) $backoff96 *= 2;
                                }
                                $doBackoff97 = $backoff96 <= 32 ||
                                                 !$doBackoff97;
                            }
                            $commit92 = true;
                            fabric.worker.transaction.TransactionManager.
                              getInstance().startTransaction();
                            try {
                                this.worker$ = fabric.worker.Worker.getWorker();
                            }
                            catch (final fabric.worker.RetryException $e93) {
                                $commit92 = false;
                                continue $label91;
                            }
                            catch (final fabric.worker.
                                     TransactionRestartingException $e93) {
                                $commit92 = false;
                                fabric.common.TransactionID $currentTid94 =
                                  $tm95.getCurrentTid();
                                if ($e93.tid.isDescendantOf($currentTid94))
                                    continue $label91;
                                if ($currentTid94.parent != null) throw $e93;
                                throw new InternalError(
                                        "Something is broken with " +
                                            "transaction management. Got a signal to restart a " +
                                            "different transaction than the one being managed.");
                            }
                            catch (final Throwable $e93) {
                                $commit92 = false;
                                if ($tm95.checkForStaleObjects())
                                    continue $label91;
                                throw new fabric.worker.AbortException($e93);
                            }
                            finally {
                                if ($commit92) {
                                    try {
                                        fabric.worker.transaction.TransactionManager.
                                          getInstance().commitTransaction();
                                    }
                                    catch (final fabric.worker.
                                             AbortException $e93) {
                                        $commit92 = false;
                                    }
                                    catch (final fabric.worker.
                                             TransactionRestartingException $e93) {
                                        $commit92 = false;
                                        fabric.common.TransactionID
                                          $currentTid94 = $tm95.getCurrentTid();
                                        if ($currentTid94 != null) {
                                            if ($e93.tid.equals(
                                                           $currentTid94) ||
                                                  !$e93.tid.isDescendantOf(
                                                              $currentTid94)) {
                                                throw $e93;
                                            }
                                        }
                                    }
                                } else {
                                    fabric.worker.transaction.TransactionManager.getInstance().abortTransaction();
                                }
                                if (!$commit92) {
                                    {  }
                                    continue $label91;
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public static final byte[] $classHash = new byte[] { 99, -47, -118, -104,
    64, -52, -40, -118, -127, -58, -60, 102, 62, -121, -93, 85, -7, 123, 2, -32,
    -16, -5, 45, -32, -126, 62, 113, -106, -120, -100, 26, 37 };
    public static final java.lang.String jlc$CompilerVersion$fabil = "0.3.0";
    public static final long jlc$SourceLastModified$fabil = 1510972468000L;
    public static final java.lang.String jlc$ClassType$fabil =
      "H4sIAAAAAAAAAO1beczsVnX3e3l5S7b3EhIIjywfyUf0HpN8ns2z5DUpHs/ibTwee2bsmQhePV5mPONtbM/YnpCKRZAoVCmlIQUVUlUNokAKalVatVUk/qAURFSJqmqp1JYIFZWKIhVV3ehCrz3z7S8fKKL/pN9Ic23f5dxz7z3nd+45vn7x+9D1ngvdp0lD3djyI0f1turSkKBZyfVUBTMkz+uA3KvyjaeI5777aeWek9BJGrpJlizb0mXJuGp5PnQLPZEWEmypPtzliCuPQefkuCEueWMfOvlYJXShDcc2opFh++tODtH/aAp+9lfedeF3roPOD6DzusX7kq/LmG35augPoJtM1RyqrocqiqoMoFstVVV41dUlQ1+CirY1gG7z9JEl+XNX9TjVs41FXPE2b+6obtLndmbMvg3Ydueyb7uA/Qsr9ue+bsC07vlXaOi0pquG4s2gn4dO0dD1miGNQMU30tujgBOKcD3OB9Vv0AGbribJ6naTU1PdUnzo3oMtdka8SYEKoOkZU/XH9k5XpywJZEC3rVgyJGsE876rWyNQ9Xp7DnrxoYuvShRUOutI8lQaqVd96M6D9dhVEah1LpmWuIkP3XGwWkIJrNnFA2u2Z7W+z/zMM49buHUSOgF4VlTZiPk/Cxrdc6ARp2qqq1qyump409vp56Q3vvTUSQgCle84UHlV5/ff/YN3PHjPl766qvOWa9RpDSeq7F+VXxje8o27sMvl62I2zjq2p8eisG/kyaqy65IroQOk/Y07FOPCre3CL3Ff6b/ns+r3TkI3ENBp2TbmJpCqW2XbdHRDdRuqpbqSryoEdE61FCwpJ6Az4J7WLXWV29I0T/UJ6JSRZJ22k2cwRRogEU/RGXCvW5q9fe9I/ji5Dx0Igs6AP/Rm8D8L/s+sr+/2IRHuekD44Vos7UMgMHBV9aa+7cDNmjW6yrp2PB8wJhmAB8l9CKiwq8uw58qwvM5bTURVTTRTB+LtbgGld/4PaYfxuC4EJ06AKb9XthV1KHlg/dayVGENoC64bSiqe1U2nnmJgN7w0scTeToX64AH5DiZsRNABu46iB572z47r9R+8PmrX1/JYtx2PaFAU7Y5XK30Xg4BUzfFOrYFUGsLoNaLJ8It7Hnic4konfYSnduhcw4M52HDBtRC6MSJZES3J40TsmD5pwBWAHLcdJl/J/lzT913HZBcJzgFFi+uunlQj3bRhwB3ElCOq/L5J7/7r1947gl7V6N8aPOQoh9uGSvqfQenx7VlVQFAuEv+7RvSF6++9MTmyRhkzgH88yUgoQBM7jnYxz6FvbINfvFUXE9DN2q2a0pGXLSNWDf4Y9cOdnOSZb8lub/1R+B3Avz/J/7Hsh1nxFeAcNharzZ2FMuH3u+PdW/LA8NTN7/9wY88/JOJprYrkbsmYDt3fUmQ1FPluav7EYwOwTRKss+CVZZ1RzJieX249GDhoUzOWcltvMQHpjVB+0d455Pf/NN/yCV2cNswnN9jQXjVv7IHjGJi5xPYuXVXYjquqoJ6f/Mx9pc/+v0nH0vEBdS4/1odbsZpPFkSmCTb/cBXZ3/1rb994c9P7oqYD5125kNDlxPO7weEHtjtCuCUASYJcOJtdi3TVoD0S0NDjcX1v86/LfPFf3zmwkrmDJCzWkEXevDHE9jNf3MFes/X3/Vv9yRkTsixndydjt1qK/B9wy5l1HWlKOYjfO+f3f3xP5E+CXQPQKenL9UEDaFkeFAyqlwiUFtJmj1QhsTJfWFSdleSf8o7bIjqsUXfVYgB/OInLmKPfm+FODsKEdN46zUQpyft0dXsZ81/OXnf6T8+CZ0ZQBeSzYRk+T3JmMerOgDbAQ9bZ9LQzfvK95v2lR27sqPwdx1Uxj3dHlTFXaQD93Ht+P6GlfYlchCegJz45krS4oEkvRwnDyZzdNKPYS7eZPmAsG4BbEua+dCZwHanqruZtLjDh25f6dDWKntLSC5x2cWVpsRpcd0lEMbr01u5rXT8jF275+vi24fi5NE4+dntfi9ODHlzGxZ6QPGB0Gyu+t5m5UIiPfHcba22RUnBm33opliBHUPyY4AKr8EXkIhbdhvTNthRfejvPvzyL97/LSABJHT9Il4dsPB7emDm8Zbzgy9+9O4bn33lQ4nCAW27+vIPUxsxVTpOaj50d8w2b89dWaUlz28mGqIq25wflkSAOibAhsV6S6Q+9ezTP9p65tmVFq72jfcf2rrtbbPaOyajvHk1PtDLW4/qJWlR//svPPFHv/nEk6t91W37d0E1a27+1l/898tbH3vla9ewpKcMe2UPDy73zR/G8x6Bbv9amYEmBN0w7Gp4aaC1mFF/WEW1cKx3Mo3qXNKxab9SHXlBOjvILaNxgE1kYplD5lGmnJPEXMcqjkjUNNqk02XSs0qb7Hl1mkxJTaYq5HpUvTtMT3gGMy2+Wp7ZfN8guhRHcWjGyffLwqxmdZglW1REDy9wsC+WRL6oFJklvlgiVq6UsxYTr6xxCsOg5fa0JDXH/LRSbOuc4SHLlJ6tVkiWCkfpVFTND8bpopKe9KRWr1UsqW12yvUI29AHY7NXZ6aFdqWORc2JrNO1qNukcJ2jKCpysA4+rFKe4TZmM7pRMxzH7i77UTNfrcnd0ZQpa0o6wCNDd9hahq7XBNtoZapjjhxYaDChwmatZ5AKR1NU4DWtXt0xMv0lEtVGqpQecVKlzvTHrblQa6E1Qu6icp6Rcrl8pGVnWRhPo3W0MCaYhd+rRQpRqYiTeiUnVEkLa8t2uYO1omgoyYQwHflE3TAGbjEtt2yCoKkBN6lQTjcktXq2nfZ5H+P1ID2o6tNBlaxlqq3JIEgbJGFgHteqiEF34JNTAbH7OUpuVNr+0iC1DDmjvTrsSXQ3q6b8kqD2EY8n0zBllpFOSh57dqNLml7ZIJuDttVs1xoq2uMlsmlU+s54mLdqPJ7Glr0arS9kvu3xhDYmBKllo7MObhBhhzNqdAs3STsKxwPBxKYK1+CKWZttWkZgUH1jNray8sjmmgY9KUs5Bwu6zCjgHZFWyXxRCGSlXsMKOtdAp+F8muLZyJzJBZnE84Mo1CaehzI0RqL1Yqu3MJopdTyrkf2Oh8+6lC42XKJQqc0tKbKoenUJ+9No0Mnjk4lKjGszxrasstKrLSszk5pjtQHWlXpwQ5VrPcddeAiNs76SG5KjvNNAOmg0YgdEvsMLeJQLmBrTKei4Q4wqdhut9XkjipqWrIhIGDSJQCWpXJYKEU/Ah2Y4d3HLAJK4JJqqVPRqHOE3+ky1my+VaUxutgpSN2oSRno5EIalCckskXxZapYyDt7G9GiOE6TNZhHMKy/Ky3KEa6QYULaDNns8OeN5m9CWAyrtYHk3ZMZUr0EFtZaBhly11+8UtVHbHatpTtC5id/RuWZ74rcXHoVjk06qkeG7aGXQ5CQxEEFtc5FRwhzf19Kwi1F1LEVVZqlKpzIokQU23eFcA4MxNa9KJpti26NWLWsbiD7plesV0Vza3RE81lMjve61iajfAEzQ2bbUHY0jzu7o5qjO52vcQKwsiGCUn2klVpW0wZx38RJMokjfM+huvuG1rayXixxSctB5Y9mpN7G6SXFNq1VGvVJKQxZIt4iidj5EUTwzscPAWxS1epcvzxkkyyywennqkwOM6JEe1heMBUdhXarrhTaB5mo1tOgySEGo5L15EylO7Tppl5BxuhTiDbVsjxo5punS+UiVgvwUEZZVmEJREm2ETjuVqlrAPXQRr2HN5iySZ8MsQxWqGMrOs5NO0K+LqKPBQTQo50qdMrbs19Jsu4I2+KXBcwE/wzmZmAvdUSOPTMZVtt0OOmqPMMcsg+UEMp1B00wwxytaHjPVWtQXOhm7RRa0YtWquaxXoAXYWvqIgLNVa0YX6GqHckzO7s7VnC3VSRIt5os0qYm2r+lAhcVmqiNPGvJEpslGi+6lWI0A8Gw2CvhA6LojFbUYvkHVO4ohURJeHU+G84lV1axmWpXzwrBpLwqVVme0cOsiC7Ot4RKRcSAtxajYYfFqVfPgcVCl6XJ/mhqFFaJkKC1uWEbyC5djlWDcb4q8iC+6Xlbu99E+T+kT3+svijDcSakZZlHpBZbtVPxunmlrhQ5SNAQt6JVUjS3W2VGwzIKu2qk+IeTGvUKACssOnAs4poOHISJbuazYSouspczEKtPQe41FO80Rnl3ozTPLuexaNKKlgKKmxux8hOEN2Qg0G4iLMBfdTFSUZo0WXApn9FKs9Fq2z3X6aLEquK2yOM3YcnMyUnvomJ4PUl1a8At5qUXKToOvV0Yc2gDD9cpWnkBEv1DBc/6kOAndFjkt6/6wOGwVLZpDa0g2JZTCTjVA+QGe8nGNXjpldJCqpEY4xWaaKR4f18dLHSUQZJqx8ED0WpoI0wwzZHA00xbgqdUf2vUhC6Ol6jzL0/jMMetcxosKU7+oqIhmOhxOF3rNfqMzoaoMP6gqZqtIUZ5ewDFL6BfUQhkms7oIB4qbXyqzAtsJwmV+1OkuyWlORsrdpiSYOMELhmnPUlTJslFKN2eKjfFWY8kHku6OejOiUVBbnaFgKX06RzSqUp7pcmZn2CwV7BE36GbMDu6OsvV6VYBdAAmY4fpTvRrRrLisl5a+s2AmPjsowTOG7VTkXq2YUR3eFQiR5bOj7EDM9vo137IYpY+Z+U6+WRGEBh/O+FRaK9B4NsNo0aQwnfVkYF7a7Syl0bwEFn45c/quZfmBTlUGVtfk/dyiWi+ReN8cwyVTV1KIKWc0i03X0MBwixWxQ9uIOrDSORx2+5nGUGq1ZgvYzwZjryC3vKFUDpilLTp2pTU1Hc0QuWHR75WLiL/MlAvUUO2O83RzKc0KQSuXI8ZOIaBKhbJiKsKCSKeCTrmpTAWaz81cze1N8ul5YaH64pSAMQ9sZVrpfA8eDpeZajWVzWcVWhOLZo1ZcpkykAQEE9vpQmM0DDF1nk77ME0JoYb7wD5mg3LUFUKJUYFLAbdm1YwpDLjF3MMHhosU5NBHnIhpZxQzHZTmLotZfgrp1LJ+hNl9MljU2cF0mcrOUbFfyWcFpMyYeleyDbbnKnO2E/FsyzJyyJTL6DkbERpLlC1QdA6n65NUOjUjlRB2wAKl9Rk7L4/DzCScSFEFYWqkUwcmu1kaTrPToMG5xYU09jLjGaVpXSWvtvC6ofYz7YWkqf58AKcXbl8fNGHNajBSs0KhbZdismkhhVWzxRC4+ZESjoUFVcOKeLpWEIfNdkZEmMliHoxLPUS3l5OiNwjKPbOv9/J4D6mkopw+ZWWzFzUZTM+Wc3iJnk9nUkm28mGOLXvTXr3FqbLGOTOJz8GLiZMtNTqZTJntqpqILh2N6mGhrfMer9QdpSCYouUAi8UscHFMEj2NyDBwzkf66sAzNaMoOINyvQyHU0HB5Ugr5FRxENIOY7bteY/HTIoojEUJH5YlEqstsXTULWGtpZHCKeDE2Km5RZGpcqpZa+nVLjsqwwOpPFnQOaZMp/rswsynyvW6IJkVUa7Vw1yJt6Qp6rgkzRHcuG8hRovIwy2B9mGxgOSltF/VKadf6nbkQJr3MpooVrLDYlGt18QMK5kF2sumAq/j5wmYGERlTeR1edgbjjisPPeM0Bljs1qrvZg2FdlbNmcoUUC6nMgbSwToH+wKzkzTLH3ByV4OZ5u8QqQjLFWleUrM++EUySNVptxPUWmUBiI0aosI26g16vZUzhUF0o+ELJIdBpQ/EUtyapjTERkh+1hOLaUopgv3My2xoOWrOW5im+wwh/hIWW4wNpsn7dwIeGbLIM3WAjMgl01L6E6jaalmt6wl8IObvUmJrFQyWDhk+wNqAPbJqZ4etYv8ku6QtE3JQsZP6bVMwXQXY4yrIFxvoEzdusYZYiRNZ5qpO31/6veRDgIznj2Sw7QxTHFppdAJvEw2y7hK5LZzBaLaYqVQQ6YaM4RDIypZkyjX9wKrVcRSiw4WLWGYU4QUX2badiXbA1umlp9lUv0212YaQVvOjDt501IMswX28U3ESE20CSnoTKs9AB7YI7FrJq5909sTl3rnncPKJY3L8MSXW8VMHoiTt68idtD6d3odfH58fZ3HpW9I4gm37wm0QLHnefervSdIvM4X3vfs80rrU5mT62hN14fO+bbzkKEuVGMPqTOxD3voPVQzeTuyG3p55Xt3l7Hpd0YrH/beAz0frP2Z5otfazwgf+QkdN1OjOXQK5n9ja7sj6zc4AKcca3OvvjKxv65in/nwP/F7eueuVqFIuLk0hERrPERZZM4UX3oLdux7M3YX9/cG8ve3HXMhzusJe8SHojjg2sWk6t//T2HA68bl7799AtxvPU1Fa2jRc52LPWYyjGVYyr/f6j8FN4fNiXdSl7BFMsP5nIPFbKXf8zv4Y3ZXPL02dz21Uurlx8bC1tXNia6tqlbC3uqVlVtz+uyS5c3Hk9eLh2BopcuX3nisuPsiR6/mmXcB6lxqeU4R0C4e0RZ8soFmKU7X43zpFV7HeaNLx0fOhWP9QDex1Y6udmP96d+cIz3x1SOqRxTef3gvasvAEd7AV/3Y4DfeOyd/MZBCD/49vGED51ZUwj3I/uZayH740ci+3uPKHt/nEQ+dHabxfh5cQC1b4mr3314l/7Xx6h9TOWYyjGV1w1qr86abKw360PbNlTJSuB7O/Ria5ceSw6ibKziVI9L5vCJ5CjG6m51Wia537DfWQeAr2sbl+yNRx7ZsOaGcXljFasBrQ1PvbI+tJKc5Ng++LVFg7Eb3fi8gyTLqudhY1WeXrp2d9uNVk87LVePlh3PtW2plu9duvzghp1kX76yZgFwpe+MamOvl3HYxzh0MGf3eMz6QNd+G3NifbBwfSTmtr0DXU3RtQ/FJMQ+dITB+qU4+YAP3bJ/Ua7lgJxZr99ea7Z9tu/ObSu2nRGXbv5Uxhw//kJS4VePGMcn4+Q5H7o/Hocsef7mtghfjZ2+q3uX41UjZ7cdssmnf3hsk4+pHFM5pvK6sclrY7yyGhuJk5LYOS/xppJ42ebcUQDTSfbGI69imY80lb6dZFxakRupPh+f746N5msgNrR93zYx29JeI4EAlKgua4NxR6+RpZ1T43vH6Ozk/tTIXL58Zb0Gq83KiunXtgj79ytbMpjA9RyATpKFZyXXT06se3HWeh8Td3/lkEv9k0ZFf/1I3/lTR5R9Ok5+zYdu3COTifG/lqm+cNh9vuPYVB9TOaZyTOX1ZqqTmOchvI5Dn+oC2Izks86tQ+WXr1wjMPqTovjnjkTxLxxR9ttx8hkfOn+AoSQQGgL/dK8nFn8c9JZrfCa4/pxVxr6svvAd6sE7XuUTwTsPfWC8bvf558+ffdPz3b9Mvnzb+VT1HA2d1eaGsfcjmj33px1X1fRkEOdWn9Sspu73fOjmfd8U+tCp+JIM6XdXdf7Ah85u14mf/zA5CXJxJ1k5sBfnbvxp9Iv//KZ/P32288r66xJoQ/7G0x97x8vffPq9X/my9uiTv9H9j8dPvvJP//nQK+97dPbcU5+4+Lb/Bbf2JmSyPQAA";
}
