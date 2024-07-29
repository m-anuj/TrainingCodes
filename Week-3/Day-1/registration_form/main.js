document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();
  
    // Get form values
    const fullName = document.getElementById('fullName').value;
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const phoneNumber = document.getElementById('phoneNumber').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    
    // Regular expressions
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const phoneRegex = /^\d{10}$/;
    const passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    
    // Validate email
    if (!emailRegex.test(email)) {
      alert('Please enter a valid email address.');
      return;
    }
  
    // Validate phone number
    if (!phoneRegex.test(phoneNumber)) {
      alert('Please enter a valid phone number (10 digits).');
      return;
    }
    
    // Validate password
    if (!passwordRegex.test(password)) {
      alert('Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one number, and one special character.');
      return;
    }
  
    // Confirm password
    if (password !== confirmPassword) {
      alert('Passwords do not match.');
      return;
    }
  
    // All validations passed
    alert('User created successfully!');
  
    // Reset the form
    document.getElementById('registrationForm').reset();
  });
  