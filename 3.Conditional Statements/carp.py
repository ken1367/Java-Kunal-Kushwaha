import cv2
import numpy as np

# Capture video from camera
cap = cv2.VideoCapture(0)

# Set image resolution
cap.set(3, 640) # width
cap.set(4, 480) # height

# Define the range of color for the car
lower_red = np.array([0, 100, 100])
upper_red = np.array([10, 255, 255])
lower_red2 = np.array([160, 100, 100])
upper_red2 = np.array([180, 255, 255])

# Define parking spot coordinates
parking_spot = [(150, 150), (150, 250), (250, 250), (250, 150)]

while True:
    # Read frame from camera
    ret, frame = cap.read()
    
    # Convert frame from BGR to HSV color space
    hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    
    # Threshold the frame to detect the car
    mask1 = cv2.inRange(hsv, lower_red, upper_red)
    mask2 = cv2.inRange(hsv, lower_red2, upper_red2)
    mask = mask1 + mask2
    
    # Find contours in the mask
    contours, _ = cv2.findContours(mask, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    
    # Draw contours on the frame
    cv2.drawContours(frame, contours, -1, (0, 255, 0), 3)
    
    # Check if the car is in the parking spot
    car_in_spot = True
    for point in parking_spot:
        if cv2.pointPolygonTest(contours[0], point, False) == -1:
            car_in_spot = False
            break
    
    # Display the result
    if car_in_spot:
        cv2.putText(frame, 'Car parked', (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 255, 0), 2, cv2.LINE_AA)
    else:
        cv2.putText(frame, 'Car not parked', (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2, cv2.LINE_AA)
    
    # Show the frame
    cv2.imshow('Parking', frame)
    
    # Exit if the user presses the 'q' key
    if cv2.waitKey(1) == ord('q'):
        break

# Release the camera and close all windows
cap.release()
cv2.destroyAllWindows()
