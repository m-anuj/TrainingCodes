package org.example;


// House.java - Abstract Product
interface Button {
    void paint();
}

// Checkbox.java - Abstract Product
interface Checkbox {
    void paint();
}

// WindowsButton.java - Concrete Product
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows style button");
    }
}

// WindowsCheckbox.java - Concrete Product
class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows style checkbox");
    }
}

// MacButton.java - Concrete Product
class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS style button");
    }
}

// MacCheckbox.java - Concrete Product
class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS style checkbox");
    }
}

// GUIFactory.java - Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// WindowsFactory.java - Concrete Factory
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// MacFactory.java - Concrete Factory
class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Client.java - Client Code
public class AbstractFactoryDesignEx  {
    private GUIFactory guiFactory;

    AbstractFactoryDesignEx(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    void createUI() {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        AbstractFactoryDesignEx windowsClient = new AbstractFactoryDesignEx(new WindowsFactory());
        windowsClient.createUI();

        AbstractFactoryDesignEx macClient = new AbstractFactoryDesignEx(new MacFactory());
        macClient.createUI();
    }
}


