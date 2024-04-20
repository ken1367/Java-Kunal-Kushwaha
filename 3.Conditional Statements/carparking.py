
import cv2
import numpy as np
import time

cap = cv2.VideoCapture(0)

parking_spot = [(50, 50), (150, 50), (150, 150), (50, 150)]

def calculate_distance(point1, point2):
    return ((point1[0] - point2[0])**2 + (point1[1] - point2[1])**2)**0.5


def detect_parking_spot(frame):
    gray_frame = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    blurred_frame = cv2.GaussianBlur(gray_frame, (5, 5), 0)
    edges = cv2.Canny(blurred_frame, 50, 200)
    contours, _ = cv2.findContours(edges, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)
    for contour in contours:
        perimeter = cv2.arcLength(contour, True)
        approx = cv2.approxPolyDP(contour, 0.02 * perimeter, True)
        if len(approx) == 4:
            if cv2.isContourConvex(approx):
                if calculate_distance(approx[0][0], approx[1][0]) < 100 and calculate_distance(approx[1][0], approx[2][0]) < 100 and calculate_distance(approx[2][0], approx[3][0]) < 100 and calculate_distance(approx[3][0], approx[0][0]) < 100:
                    return approx
    return None
while True:
    ret, frame = cap.read()
    if ret:
        parking_spot_detected = detect_parking_spot(frame)
        if parking_spot_detected is not None:
            cv2.drawContours(frame, [parking_spot_detected], -1, (0, 255, 0), 2)
            cv2.imshow("Parking Spot Detection", frame)
    if cv2.waitKey(1) == ord('q'):
        break


cap.release()
cv2.destroyAllWindows()
