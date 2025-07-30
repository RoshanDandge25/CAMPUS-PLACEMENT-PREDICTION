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

# Secreenshot
![WhatsApp Image 2025-07-30 at 15 50 15_114eb155](https://github.com/user-attachments/assets/4ecde303-6114-4853-aae2-8240544d8ffd)
![WhatsApp Image 2025-07-30 at 15 50 15_e65beea5](https://github.com/user-attachments/assets/96affdd8-2f99-4e7d-8b78-689cf5408b4f)
<img width="200" height="200" alt="Flow 1" src="https://github.com/user-attachments/assets/efd0bac6-80ef-49dd-b34e-75b7966a6604" />

<img width="200" height="200" alt="Flow 2" src="https://github.com/user-attachments/assets/bf849216-862d-4b7e-954d-4a9ccc1454b2" />

## 🔧 How to Run

1. Open the project in **Android Studio**
2. Connect Firebase:
   - Add `google-services.json` in `/app`
   - Enable Firebase Auth & Realtime Database
3. Click ▶️ Run on emulator or real device

## 🧑‍💻 Developer

Made with ❤️ by Roshan Dandge , Rushikesh Joshi , Vijay Shilwant , Shreyash Rajput 
               
