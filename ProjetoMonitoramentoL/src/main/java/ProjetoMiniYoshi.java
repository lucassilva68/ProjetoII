cd C:\Users\lssantos\Documents\NetBeansProjects\Exercicios; "JAVA_HOME=C:\\Program Files\\Java\\jdk-11.0.4" cmd /c "\"\"C:\\Users\\lssantos\\Desktop\\Netbeans\\incubating-netbeans-11.0\\netbeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.args=\"-classpath %classpath MinProjeto\" -Dexec.executable=\"C:\\Program Files\\Java\\jdk-11.0.4\\bin\\java.exe\" -Dexec.classpathScope=runtime -Dmaven.ext.class.path=C:\\Users\\lssantos\\Desktop\\Netbeans\\incubating-netbeans-11.0\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar -Dfile.encoding=UTF-8 org.codehaus.mojo:exec-maven-plugin:1.5.0:exec\""
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...
                                                                        
------------------------------------------------------------------------
Building MiniProjeto 1.0-SNAPSHOT
------------------------------------------------------------------------
The POM for unknown.binary:AbsoluteLayout:jar:SNAPSHOT is missing, no dependency information available

--- exec-maven-plugin:1.5.0:exec (default-cli) @ Exercicios ---
Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: empty String
	at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
	at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
	at java.base/java.lang.Double.parseDouble(Double.java:543)
	at java.base/java.lang.Double.valueOf(Double.java:506)
	at MinProjeto.jButton1ActionPerformed(MinProjeto.java:239)
	at MinProjeto$1.actionPerformed(MinProjeto.java:91)
	at java.desktop/javax.swing.AbstractButton.fireActionPerformed(AbstractButton.java:1967)
	at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(AbstractButton.java:2308)
	at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(DefaultButtonModel.java:405)
	at java.desktop/javax.swing.DefaultButtonModel.setPressed(DefaultButtonModel.java:262)
	at java.desktop/javax.swing.plaf.basic.BasicButtonListener$Actions.actionPerformed(BasicButtonListener.java:330)
	at java.desktop/javax.swing.SwingUtilities.notifyAction(SwingUtilities.java:1810)
	at java.desktop/javax.swing.JComponent.processKeyBinding(JComponent.java:2900)
	at java.desktop/javax.swing.JComponent.processKeyBindings(JComponent.java:2948)
	at java.desktop/javax.swing.JComponent.processKeyEvent(JComponent.java:2862)
	at java.desktop/java.awt.Component.processEvent(Component.java:6409)
	at java.desktop/java.awt.Container.processEvent(Container.java:2263)
	at java.desktop/java.awt.Component.dispatchEventImpl(Component.java:5008)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2321)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4840)
	at java.desktop/java.awt.KeyboardFocusManager.redispatchEvent(KeyboardFocusManager.java:1950)
	at java.desktop/java.awt.DefaultKeyboardFocusManager.dispatchKeyEvent(DefaultKeyboardFocusManager.java:870)
	at java.desktop/java.awt.DefaultKeyboardFocusManager.preDispatchKeyEvent(DefaultKeyboardFocusManager.java:1139)
	at java.desktop/java.awt.DefaultKeyboardFocusManager.typeAheadAssertions(DefaultKeyboardFocusManager.java:1009)
	at java.desktop/java.awt.DefaultKeyboardFocusManager.dispatchEvent(DefaultKeyboardFocusManager.java:835)
	at java.desktop/java.awt.Component.dispatchEventImpl(Component.java:4889)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2321)
	at java.desktop/java.awt.Window.dispatchEventImpl(Window.java:2772)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4840)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:772)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:721)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:715)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:85)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:95)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:745)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:743)
	at java.base/java.security.AccessController.doPrivileged(Native Method)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:85)
	at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:742)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
	at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time: 01:38 min
Finished at: 2019-09-06T11:07:43-03:00
Final Memory: 7M/27M
------------------------------------------------------------------------
