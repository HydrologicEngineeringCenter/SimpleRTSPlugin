/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplertsplugin;

import com.rma.factories.NewObjectFactory;
import com.rma.model.Project;
import hec2.map.GraphicElement;
import hec2.model.DataLocation;
import hec2.plugin.action.EditAction;
import hec2.plugin.action.OutputElement;
import hec2.plugin.lang.ModelLinkingException;
import hec2.plugin.lang.OutputException;
import hec2.plugin.model.ModelAlternative;
import hec2.plugin.selfcontained.AbstractSelfContainedPlugin;
import hec2.plugin.selfcontained.SelfContainedPluginAlt;
import hec2.rts.plugin.RtsPlugin;
import hec2.rts.plugin.RtsPluginManager;
import hec2.rts.ui.RtsTabType;
import java.util.List;
import rma.swing.RmaImage;
import com.rma.client.BrowserAction;
import javax.swing.Icon;
import javax.swing.Action;
import  com.rma.client.Browser;
import hec2.rts.client.RtsFrame;




 //
// @author q0hecemt
//

 
public class SimpleRTSPluginMain extends AbstractSelfContainedPlugin implements RtsPlugin {
    
    public static final String PLUGINNAME = "Simple RTS Plugin";
    public static final String PluginShortName = "Simple";
    private static final String PLUGIN_VERSION = "0.1.0";
    private static final String PLUGIN_DIRECTORY = "SimpleRTSPlugin";
    private static final String PLUGIN_EXTENSION = ".sp";	
    
    public static void main (String[] args) {
        //code application logic here
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

    @Override
    public void editAlternative(SelfContainedPluginAlt e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected SelfContainedPluginAlt newAlternative(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAltFileExtension() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPluginDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected NewObjectFactory getAltObjectFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GraphicElement> getGraphicElements(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OutputElement> getOutputReports(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayEditor(GraphicElement ge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayOutput(OutputElement oe, List<ModelAlternative> list) throws OutputException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EditAction> getEditActions(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editAction(String string, ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean compute(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DataLocation> getDataLocations(ModelAlternative ma, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setDataLocations(ModelAlternative ma, List<DataLocation> list) throws ModelLinkingException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean copyModelFiles(ModelAlternative ma, String string, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EditAction> getGlobalEditActions(RtsTabType rtt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean closeForecast(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
