# 📱 Campus Placement Prediction App

An Android application designed to help assess student placement readiness based on academic details, test scores, and skill evaluations. Built for Training & Placement Officers (TPOs) to monitor students in real-time.

## 🚀 Features

- 👤 Student Registration & Login (Firebase Authentication)
- ☁️ Realtime data storage using Firebase Realtime Database
- 🔍 Rule-based logic to classify students:
  - ✅ **Ready for Placement**
  - ⚠️ **At Risk**
- 📋 Form to enter academic data (10th, 12th, Degree marks)
- 📝 Internal/Skill test input with result evaluation
- 🛡️ Admin dashboard to monitor student status

## 🛠️ Tech Stack

- **Platform**: Android (Java or Kotlin)
- **IDE**: Android Studio
- **Backend**: Firebase
  - Authentication
  - Realtime Database
- **UI**: XML + Material Design

## 🧠 Prediction Logic

The app uses **rule-based evaluation**, not machine learning. Example:

- If 10th %, 12th %, Degree % > 60  
- AND Skill Test Score > 60%  
- THEN: ✅ **Ready**  
- ELSE: ⚠️ **At Risk**

> Logic is defined in utility classes or main activity (e.g., `Predictor.java` or `MainActivity.java`).


## 📷 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/4ecde303-6114-4853-aae2-8240544d8ffd" width="500" height="500" />
  <img src="https://github.com/user-attachments/assets/96affdd8-2f99-4e7d-8b78-689cf5408b4f" width="500" height="500" />
  <img src="https://github.com/user-attachments/assets/efd0bac6-80ef-49dd-b34e-75b7966a6604" width="500" height="500" />
  <img src="https://github.com/user-attachments/assets/bf849216-862d-4b7e-954d-4a9ccc1454b2" width="500" height="500" />
</p>

## 🔧 How to Run

1. Open the project in **Android Studio**
2. Connect Firebase:
   - Add `google-services.json` in `/app`
   - Enable Firebase Auth & Realtime Database in Firebase Console
3. Click ▶️ Run on emulator or real device

## 🧑‍💻 Developer

Made with ❤️ by **Roshan Dandge , Rushikesh Joshi , Vijay Shilwant , Shreyash Rajput** 
🔗 [GitHub: RoshanDandge25](https://github.com/RoshanDandge25)


