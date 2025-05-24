import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.border.TitledBorder;

public class DSA {
    private JFrame frame;
    private JTextField animalNameField, animalAgeField, quantityField, BreedField;
    private JComboBox<String> animalTypeComboBox, healthComboBox;
    private Queue<String> animalQueue;
    private JLabel animalImageLabel;
    private JTextArea animalDetailsTextArea;
    private LinkedList<Animal> animals;
    private Stack<String> animalImages;
    private JTextField searchField;
    private File uploadedImage;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;

    static class Animal {
        public String genderGroup;
        String type, name, Breed, gender;
        int age, quantity;
        String healthStatus;
        String imagePath;

        Animal(String type, String name, int age, String healthStatus, String Breed, int quantity, String gender, String imagePath) {
            this.type = type;
            this.name = name;
            this.age = age;
            this.healthStatus = healthStatus;
            this.Breed = Breed;
            this.quantity = quantity;
            this.gender = gender;
            this.imagePath = imagePath;
        }
    }

    public DSA() {
        animals = new LinkedList<>();
        animalQueue = new LinkedList<>();
        animalImages = new Stack<>();
        loadAnimalImages();

        frame = new JFrame("FarmSphere");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(255, 255, 255));
        frame.add(mainPanel);

        JPanel inputPanel = new JPanel(new GridLayout(9, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 128, 0), 2),
                "Add Animal"
        ));
        inputPanel.setBackground(new Color(234, 211, 113));

        JLabel typeLabel = new JLabel("Animal Type:");
        JLabel nameLabel = new JLabel("Animal Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel healthLabel = new JLabel("Health:");
        JLabel BreedLabel = new JLabel("Breed:");
        JLabel quantityLabel = new JLabel("Quantity:");
        JLabel genderLabel = new JLabel("Gender:");

        animalNameField = new JTextField();
        animalAgeField = new JTextField();
        quantityField = new JTextField();
        BreedField = new JTextField();

        String[] animalTypes = {"Pet", "Aqua", "Farm", "Jungle"};
//        drop down list klia we used JCombo Box
        animalTypeComboBox = new JComboBox<>(animalTypes);

        String[] healthOptions = {"Sick", "Fit"};
        healthComboBox = new JComboBox<>(healthOptions);

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        JButton addButton = new JButton("Add Animal");
        addButton.setBackground(new Color(71, 236, 71));
        JButton uploadButton = new JButton("Upload Image");
        uploadButton.setBackground(new Color(255, 182, 193));

        inputPanel.add(typeLabel);
        inputPanel.add(animalTypeComboBox);
        inputPanel.add(nameLabel);
        inputPanel.add(animalNameField);
        inputPanel.add(ageLabel);
        inputPanel.add(animalAgeField);
        inputPanel.add(healthLabel);
        inputPanel.add(healthComboBox);
        inputPanel.add(BreedLabel);
        inputPanel.add(BreedField);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityField);
        inputPanel.add(genderLabel);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        inputPanel.add(genderPanel);

        inputPanel.add(uploadButton);
        inputPanel.add(addButton);

        JPanel listPanel = new JPanel(new BorderLayout());
//        jahn sara record arha wo
        listPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(211, 126, 41), 2),
                "Animal List",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Arial", Font.BOLD, 25)
        ));
        listPanel.setBackground(new Color(143, 207, 246));

        DefaultListModel<String> animalListModel = new DefaultListModel<>();
        JList<String> animalList = new JList<>(animalListModel);

        JScrollPane scrollPane = new JScrollPane(animalList);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel detailPanel = new JPanel(new BorderLayout());
        detailPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(255, 128, 0), 2),
                "Animal Details",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Arial", Font.BOLD, 18)
        ));
        detailPanel.setBackground(new Color(232, 232, 215));
        animalImageLabel = new JLabel();
        animalImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        animalImageLabel.setPreferredSize(new Dimension(400, 400));
        animalDetailsTextArea = new JTextArea();
        animalDetailsTextArea.setEditable(false);
        animalDetailsTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        animalDetailsTextArea.setBackground(new Color(250, 167, 167));
        animalDetailsTextArea.setLineWrap(true);
        detailPanel.add(animalImageLabel, BorderLayout.NORTH);
        detailPanel.add(new JScrollPane(animalDetailsTextArea), BorderLayout.CENTER);

        JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//        search wala panel
        actionPanel.setBackground(new Color(143, 207, 246));
        JButton deleteButton = new JButton("Delete Selected");
        deleteButton.setBackground(new Color(230, 16, 16));
        deleteButton.setForeground(Color.WHITE);
        searchField = new JTextField(15);
        JButton searchButton = new JButton("Search by Name");
        searchButton.setBackground(new Color(11, 163, 246));
        searchButton.setForeground(Color.WHITE);

        // Add cow emoji to the action panel
        JLabel cowLabel = new JLabel("\uD83D\uDC2E"); // Cow emoji
        cowLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
        actionPanel.add(cowLabel);


        actionPanel.add(searchButton);
        actionPanel.add(searchField);
        actionPanel.add(deleteButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(listPanel, BorderLayout.CENTER);
        mainPanel.add(detailPanel, BorderLayout.EAST);
        mainPanel.add(actionPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addAnimal(animalListModel));
        deleteButton.addActionListener(e -> deleteAnimal(animalList, animalListModel));
        searchButton.addActionListener(e -> searchAnimal());
        uploadButton.addActionListener(e -> uploadImage());

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }

    private void loadAnimalImages() {
        animalImages.push("images/cow.jpg");
        animalImages.push("images/chicken.jpg");
        animalImages.push("images/sheep.jpg");
        animalImages.push("images/goat.jpg");
        animalImages.push("images/horse.jpg");
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Animal Image");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            uploadedImage = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(frame, "Image uploaded successfully!");
        }
    }
    private void addAnimal(DefaultListModel<String> animalListModel) {
        try {
            // Retrieve user inputs
            String type = (String) animalTypeComboBox.getSelectedItem();
            String name = animalNameField.getText().trim();
            String breed = BreedField.getText().trim();
            int age, quantity;

            // Validate numeric inputs
            try {
                age = Integer.parseInt(animalAgeField.getText().trim());
                quantity = Integer.parseInt(quantityField.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Age and Quantity must be valid numbers.");
                return;
            }

            String healthStatus = (String) healthComboBox.getSelectedItem();
            if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Please select a gender!");
                return;
            }
            String gender = maleRadioButton.isSelected() ? "Male" : "Female";

            // Validate required fields
            if (type == null || name.isEmpty() || breed.isEmpty() || uploadedImage == null) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields and upload an image!");
                return;
            }

            // Add new animal to the list
            String imagePath = uploadedImage.getAbsolutePath();
            Animal newAnimal = new Animal(type, name, age, healthStatus, breed, quantity, gender, imagePath);
            animals.add(newAnimal);
            animalQueue.offer(newAnimal.name); // Update Queue
            animalListModel.addElement(newAnimal.name); // Update JList
            saveAnimalToFile(newAnimal);

            // Reset fields
            animalTypeComboBox.setSelectedIndex(0);
            animalNameField.setText("");
            animalAgeField.setText("");
            quantityField.setText("");
            BreedField.setText("");
            genderGroup.clearSelection();
            uploadedImage = null;

            JOptionPane.showMessageDialog(frame, "Animal added successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + e.getMessage());
        }
    }
    private void saveAnimalToFile(Animal animal) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("animal_details.txt", true))) {
            writer.write("Type: " + animal.type);
            writer.newLine();
            writer.write("Name: " + animal.name);
            writer.newLine();
            writer.write("Age: " + animal.age);
            writer.newLine();
            writer.write("Health: " + animal.healthStatus);
            writer.newLine();
            writer.write("Species: " + animal.Breed);
            writer.newLine();
            writer.write("Species: " + animal.gender);
            writer.newLine();
            writer.write("Quantity: " + animal.quantity);
            writer.newLine();
            writer.write("Image: " + (animal.imagePath != null ? animal.imagePath : "No Image"));
            writer.newLine();
            writer.write("----------------------------------------------");
            writer.newLine(); // To separate different animals' details
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error saving animal details to file.");
        }
    }
    private void searchAnimal() {
        String searchQuery = searchField.getText().trim().toLowerCase();
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.name.toLowerCase().contains(searchQuery)) {
                String gender = "Unknown"; // Default value
                if (animal.gender != null) { // Check if gender is not null
                    String genderNormalized = animal.gender.trim().toLowerCase();
                    if (genderNormalized.equals("male")) {
                        gender = "Male";
                    } else if (genderNormalized.equals("female")) {
                        gender = "Female";}
                }
                // Update the animal details display
                animalDetailsTextArea.setText(
                        "Animal Type: " + animal.type + "\n" +
                                "Name: " + animal.name + "\n" +
                                "Age: " + animal.age + "\n" +
                                "Gender: " + gender + "\n" +
                                "Health: " + animal.healthStatus + "\n" +
                                "Breed: " + animal.Breed + "\n" +
                                "Quantity: " + animal.quantity);
                if (animal.imagePath != null) {
                    animalImageLabel.setIcon(new ImageIcon(animal.imagePath)); // Display the image
                } else {
                    animalImageLabel.setIcon(null); // Clear the image if no image is available
                }
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(frame, "No animal found with the given name.");
            animalDetailsTextArea.setText(""); // Clear the details area if not found
            animalImageLabel.setIcon(null); // Clear the image if not found
        }
    }
    private void deleteAnimal(JList<String> animalList, DefaultListModel<String> animalListModel) {
        int selectedIndex = animalList.getSelectedIndex();
        if (selectedIndex != -1) {
            animals.remove(selectedIndex);
            animalQueue.remove(); // Removing the animal from the Queue
            animalListModel.removeElementAt(selectedIndex); // Remove from JList model
            animalDetailsTextArea.setText("");
            JOptionPane.showMessageDialog(frame, "Animal deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(frame, "Please select an animal to delete.");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DSA::new);}}
