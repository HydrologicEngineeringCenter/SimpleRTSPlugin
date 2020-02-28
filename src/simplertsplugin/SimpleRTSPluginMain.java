/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplertsplugin;


import com.rma.model.Project;
import hec2.map.GraphicElement;
import hec2.model.DataLocation;
import hec2.plugin.action.EditAction;
import hec2.plugin.action.OutputElement;
import hec2.plugin.lang.ModelLinkingException;
import hec2.plugin.lang.OutputException;
import hec2.plugin.model.ModelAlternative;
import hec2.plugin.AbstractPlugin;
import hec2.rts.plugin.SimpleRtsPlugin;
import hec2.rts.plugin.RtsPluginManager;
import hec2.rts.ui.RtsTabType;
import java.util.List;
import rma.swing.RmaImage;
import com.rma.client.BrowserAction;
import javax.swing.Icon;
import javax.swing.Action;
import  com.rma.client.Browser;
import com.rma.model.ComputeProgressListener;
import hec.heclib.util.HecTime;
import hec.watershed.model.Condition;
import hec2.model.ProgramOrderItem;
import hec2.rts.client.RtsFrame;




 //
// @author q0hecemt
//

//Extends AbstractPlugin. Simple plugin that does nopt 
public class SimpleRTSPluginMain extends AbstractPlugin implements SimpleRtsPlugin {
    
    public static final String PLUGINNAME = "Simple RTS Plugin";
    public static final String PluginShortName = "Simple";
    private static final String PLUGIN_VERSION = "0.1.0";
    private static final String PLUGIN_DIRECTORY = "SimpleRTSPlugin";
    private static final String PLUGIN_EXTENSION = ".sp";	
    
    public static void main (String[] args) {
        SimpleRTSPluginMain p = new SimpleRTSPluginMain();
       
    }
    public SimpleRTSPluginMain(){
        super();
        setName(PluginShortName);
        RtsPluginManager.register(this);
        addToToolsToolbar();
    }
    
        protected void addToToolsToolbar(){
        
        Icon i = RmaImage.getImageIcon("Images/anchor.png");
        // constructor public BrowserAction(java.lang.String name, javax.swing.Icon icon, java.lang.Object methodContainer, java.lang.String methodName)
        // action of the button/menu item is defined by the fourth argument                  
        BrowserAction a = new BrowserAction(PluginShortName, i , this , "displayApplicationUnique" );   
//        Setting SHORT_DESCRIPTION field to PluginShortName for the new BrowserAction?
        a.putValue(Action.SHORT_DESCRIPTION, getName());            
        //Insert the menu item in the Tools menu in the third position
       Browser.getBrowserFrame().getToolsMenu().insert(a,3);
       //Casting BrowserFrame to RtsFrame type , add the BrowserAction to the Programs toolbar
       ((RtsFrame)Browser.getBrowserFrame()).getProgramToolbar().add(a);
        
    }   

    @Override
    public boolean createProject(Project prjct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean openProject(Project prjct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean close(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProjectName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveProject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLogfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayApplication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVersion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}
